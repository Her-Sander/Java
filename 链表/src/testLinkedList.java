public class testLinkedList {
    public static void main(String[] args) {
        //testAddFirst();
        //testAddLast();
        testAddIndex();
        //testContains();
        //testToremove();
        //testToremoveAll();
        //testClear();
    }

    public static void testAddFirst(){
        LinkedList list=new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();
    }
    public static void testAddLast(){
        LinkedList list=new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();
        list.addLast(99);
        list.display();
    }
    public static void testAddIndex(){
        LinkedList list=new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();
        list.addIndex(0,0);
        list.display();
    }
    public static void testContains(){
        LinkedList list=new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        System.out.println(list.contains(4));
    }
    public static void testToremove(){
        LinkedList list=new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(6);
        list.addFirst(7);
        list.display();
        list.remove(70);
        list.display();
    }
    public static void testToremoveAll(){
        LinkedList list=new LinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(3);
        list.display();
        list.toremoveAll(3);
        list.display();
    }
    public static void testClear(){
        LinkedList list=new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(6);
        list.addFirst(7);
        list.display();
        list.clear();
        list.display();
    }
}