package dlinklist;

class DLinkedNode{
    public int val=0;
    public DLinkedNode prev=null;
    public DLinkedNode next=null;
    public DLinkedNode(int val) {
        this.val = val;
    }
}
public class DLinkedList {
    private DLinkedNode head=null;
    public DLinkedList() {
        head = new DLinkedNode(-1);
        head.next = head;
        head.prev = head;
    }
    //头插
    public void addFirst(int data) {
        DLinkedNode newnode = new DLinkedNode(data);
        //头插必须找到头结点的下一个元素next=head.next
        DLinkedNode next = head.next;
        newnode.next = next;
        next.prev = newnode;
        head.next= newnode;
        newnode.prev = head;
    }
    public void addLast(int data) {
        DLinkedNode newnode = new DLinkedNode(data);
        //尾插要找到最后一个元素,即头结点的前一个元素
        DLinkedNode prev = head.prev;
        newnode.next = head;
        prev.next = newnode;
        newnode.prev = prev;
        head.prev = newnode;
    }
    //任意位置插入元素
    public void addIndex(int index,int data) {
        int size = Size();
        if (index < 0 || index > size) {
            return;
        }
        DLinkedNode newnode = new DLinkedNode(data);
        //获得要插入的节点的地方
        DLinkedNode cur = getindex(index);
        //再获得要插入的节点的前一个节点,将新节点插入这两个节点之间
        DLinkedNode prev = cur.prev;
        prev.next = newnode;
        newnode.next = cur;
        newnode.prev = prev;
        cur.prev = newnode;
    }
    //获得当前位置的节点
    public DLinkedNode getindex(int a){
        DLinkedNode cur=head.next;
        for(int i=0;i<a;i++){
            cur=cur.next;
        }
        return cur;
    }
    //是否包含关键字tofind
    public boolean Contains(int key){
        for(DLinkedNode cur=head.next;cur!=head;cur=cur.next){
            if(cur.val==key){
                return true;
            }
        }
        return false;
    }
    //删除值为key的值
    public void remove(int key) {
        DLinkedNode cur = getval(key);
        if (cur == null) {
            return;
        }
        DLinkedNode prev = cur.prev;
        DLinkedNode next = cur.next;
        prev.next = next;
        next.prev = prev;
    }
    //删除所有值为key的数
    public void removeAll(int key) {
        while (true) {
            DLinkedNode cur = getval(key);
            if (cur == null) {
                return;
            }
            DLinkedNode prev = cur.prev;
            DLinkedNode next = cur.next;
            prev.next = next;
            next.prev = prev;
        }
    }
    public DLinkedNode getval(int key) {
        for (DLinkedNode cur = head.next; cur != head; cur = cur.next) {
            if (cur.val == key) {
                return cur;
            }
        }
        return null;
    }
    //双链表的长度
    public int Size(){
        int size=0;
        for(DLinkedNode cur=head.next;cur!=head;cur=cur.next){
            size++;
        }
        return size;
    }
    //清空双链表
    public void clear(){
        head.prev=head;
        head.next=head;
    }
    public void display() {
        System.out.print("正向:[");
        //!!!!注意这里的head是傀儡节点不是链表的第一个元素!!!!!!!
        for (DLinkedNode cur = head.next; cur != head; cur = cur.next) {
            System.out.print(cur.val);
            if (cur.next != head) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
        System.out.print("反向:[");
        //!!!!注意这里的head是傀儡节点不是链表的第一个元素!!!!!!!
        for (DLinkedNode cur = head.prev; cur != head; cur = cur.prev) {
            System.out.print(cur.val);
            if (cur.prev != head) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
