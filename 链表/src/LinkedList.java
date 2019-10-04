class LinkedNode {
    public int data = 0;
    public LinkedNode next = null;
    public LinkedNode(int data) {
        this.data = data;
    }
}
public class LinkedList {
    // 链表的头结点(第一个节点). 有了这个头结点之后
    // 就可以根据 next 把所有的剩下的元素都获取到
    private LinkedNode head = null;

    public void addFirst(int value) {
        LinkedNode node = new LinkedNode(value);
        if (this.head == null) {
            // 如果是空链表
            this.head = node;
            return;
        }
        // 非空的情况
        node.next = head;
        head = node;
        return;
    }
    public void addLast(int value){
        LinkedNode node=new LinkedNode(value);
        //空链表
        if(this.head==null){
            head=node;
            return;
        }
        //要想尾插,即要找到最后一个元素
        LinkedNode cur=this.head;
        //如果cur的next为空,则cur为最后一个元素
        while(cur.next!=null){
            cur=cur.next;
        }
        //循环结束,cur 指向最后一个元素
        cur.next=node;
    }
    public void addIndex(int index,int value){
        LinkedNode node=new LinkedNode(value);
        int len=Size();
        //检验index的合法性
        if(index<0||index>len){
            return;
        }
        if(index==0){
            addFirst(value);
            return;
        }
        if(index==len){
            addLast(value);
            return;
        }
        //获得下标的前一个节点prev
        LinkedNode prev=getPos(index-1);
        node.next=prev.next;
        prev.next=node;
    }
    private LinkedNode getPos(int pos){
        LinkedNode cur=this.head;
        for(int i=0;i<pos;i++){
            cur=cur.next;
        }
        return cur;
    }
    public boolean contains(int key){
        for(LinkedNode cur=this.head;cur!=null;cur=cur.next){
            if(cur.data==key){
                return true;
            }
        }
        return false;
    }
    public void remove(int key){
        if(contains(key)==false){
            return;
        }
        if(head==null){
            return;
        }
        if(head.data==key){
            this.head=this.head.next;
            return;
        }
        LinkedNode prev=searchprev(key);
        //prev.next=prev.next.next;
        LinkedNode node=prev.next;
        prev.next=node.next;
    }
    //删除链表中出现的指定的所有数
    public void toremoveAll(int key){
        if(this.head==null){
            return;
        }
        //先删除头结点后面的数,最后删除头结点
        LinkedNode prev=this.head;
        LinkedNode cur=this.head.next;
        while (cur!=null){
            if(cur.data==key){    //为要删除的数
                prev.next=cur.next;//删除cur节点
                cur=prev.next;     //更新cur
            }else {
                prev=cur;          //不是要删除的数更新prev和cur
                cur=cur.next;
            }
        }
        if(this.head.data==key){
            this.head=this.head.next;
        }
        return;
    }

    public void clear(){
        this.head=null;
        return;
    }
    public LinkedNode searchprev(int value){
        LinkedNode prev=this.head;
        while(prev.next!=null){
            if(prev.next.data==value){
                return prev;
            }
            prev=prev.next;
        }
        return null;
    }

    public int Size(){
        int size=0;
        for(LinkedNode node=this.head;node!=null;node=node.next){
            size++;
        }
        return size;
    }
    public void display() {
        System.out.print("[");
        for (LinkedNode node = this.head; node != null; node = node.next) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}





