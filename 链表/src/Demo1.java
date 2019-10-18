public class Demo1 {
    //1,删除链表中的等于的所有给定值
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        //先删除后面的元素,再删除头结点
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                //是要删除的值
                prev.next = cur.next;//直接跳过cur
                cur = prev.next;      //更新cur
            } else {
                //不是要删除的值直接更新prev和cur
                prev = cur;
                cur = cur.next;
            }
        }
        //再删除头结点
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }
    //2.翻转一个链表
    public ListNode reverseList(ListNode head) {
        //空链表
        if (head == null) {
            return null;
        }
        //一个节点的链表
        if (head.next == null) {
            return head;
        }
        //多个节点
        ListNode newhead = null;
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                newhead = cur;
            }
            cur.next = prev;//反转指针的操作
            prev = cur;//更新prev和cur
            cur = next;
        }
        return newhead;
    }
    //给定一个带头节点的链表返回中间节点,有两个中间节点,返回第二个中间节点
    public ListNode middleNode(ListNode head) {
        //返回中间节点,即要知道链表的长度
        ListNode cur = head;
        int len = Size(head) / 2;
        for (int i = 0; i < len; i++) {
            cur = cur.next;
        }
        return cur;
    }
    //输入一个链表,输出该链表中倒数第k个节点
    public ListNode FindKthToTail(ListNode head,int k) {
        int setoff = Size(head) - k;
        //首先要对K进行合法性检验
        if (head == null || k <= 0 || k > Size(head)) {
            return null;
        }
        ListNode cur = head;
        for (int i = 0; i < setoff; i++) {
            cur = cur.next;
        }
        return cur;
    }
    public int Size(ListNode head) {
        int size = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }
    // 将两个有序链表合并为一个新的有序链表并返回
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode newhead = null;
        ListNode newtail = null;
        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                //l1的值小于l2的值
                if (newhead == null) {//新链表是空链表
                    newhead = cur1;//这里newhead和newtail相等
                    newtail = cur1;//返回newhead即返回newtail
                    cur1 = cur1.next;
                } else {//新链表不是空链表
                    newtail.next = cur1;
                    newtail = newtail.next;
                    cur1 = cur1.next;
                }
            } else {
                //l2的值小于l1的值
                if (newhead == null) {
                    //新链表是空链表
                    newhead = cur2;
                    newtail = cur2;
                    cur2 = cur2.next;
                } else {
                    //新链表不是空链表
                    newtail.next = cur2;
                    newtail = newtail.next;
                    cur2 = cur2.next;
                }
            }
        }
        /*用伪节点处理不用考虑该节点是否为第一个节点插入新链表
        *ListNode newhead=new ListNode(-1);
        *ListNode newtail=newhead;
        *while(cur1!=null&&cur2!=null){
        *   if(cur1.val<=cur2.val){
        *       newtail.next=cur1;
        *       newtail=newtail.next;
        *       cur1=cur1.next;
        *   }else{
        *       newtail.next=cur2;
        *       newtail=newtail.next;
        *       cur2=cur2.next;
        *    }
        * }
        */
        //判断尾部
        if (cur1 == null) {
            //若cur1先到尾部,则将cur2的后面放到newtail里
            newtail.next = cur2;
        } else {
            newtail.next = cur1;
        }
        return newhead;
    }
    //给定值x为基准,讲链表分隔成两个部分,小于x的位于大于或者等于x之前
    public ListNode partition(ListNode pHead, int x) {
        //空链表
        if (pHead == null) {
            return null;
        }
        //链表中只有一个元素
        if (pHead.next == null) {
            return pHead;
        }
        //多个节点
        ListNode smallhead = new ListNode(-1);
        ListNode smalltail = smallhead;
        ListNode bighead = new ListNode(-1);
        ListNode bigtail = bighead;
        for (ListNode cur = pHead; cur != null; cur = cur.next) {
            if (cur.val < x) {
                smalltail.next = new ListNode(cur.val);
                smalltail = smalltail.next;
            } else {
                bigtail.next = new ListNode(cur.val);
                bigtail = bigtail.next;
            }
        }
        smalltail.next = bighead.next;
        return smallhead.next;
    }
    //删除有序链表中重复的节点
    public ListNode deleteDuplication(ListNode pHead) {
        //空链表
        if (pHead == null) {
            return null;
        }
        //多个节点的链表
        //思路:创建一个新链表将链表中不重复的节点放到新链表中
        ListNode cur = pHead;
        ListNode newhead = new ListNode(-1);
        ListNode newtail = newhead;
        while (cur != null) {
            //判断cur是否等于cur.next
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    //用来跳过多个相同的值
                    cur = cur.next;
                }//此时的cur是相同的值的最后一个,仍为相同的值
                cur = cur.next;//更新到不相同的值,方便直接跳过
            } else {
                //不等于直接将cur的值放到新链表的尾部
                newtail.next = new ListNode(cur.val);
                newtail = newtail.next;
                cur = cur.next;
            }
        }
        return newhead.next;
    }
    //判断一个链表是不是回文链表
    public boolean chkPalindrome(ListNode A) {
        //空链表或者单节点的链表
        if (A == null || A.next == null) {
            return true;
        }
        //找到中间节点
        int step = Size(A) / 2;
          ListNode B = A;
        for (int i = 0; i < step; i++) {
            B = B.next;
        }
        //逆置中间节点后面的链表
        ListNode prev = null;
        ListNode cur = B;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                B = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        //比较两个链表是否相等
        while (B != null) {
            if (A.val != B.val) {
                return false;
            }
            //比较完记得更新AB继续比较
            A = A.next;
            B = B.next;
        }
        return true;
    }
    //输入两个链表,输出两个链表的公共节点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int a = Size(headA);
        int b = Size(headB);
        //注意哪个链表长则让哪个先走
        if (a > b) {
            for (int i = 0; i < (a - b); i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < (b - a); i++) {
                headB = headB.next;
            }
        }
        while (headB != null && headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
