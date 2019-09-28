public class TestSeqList {
    public static void main(String[] args) {
        //TestAdd();
        //TestContains();
        //TestSearch();
        //TestGetPos();
        //TestSetPos();
        //TestReMove();
        //TestSize();
        TestClear();
    }
    public static void TestAdd(){
        SeqList seqlist=new SeqList();
        seqlist.add(0,1);
        seqlist.add(1,2);
        seqlist.add(2,3);
        seqlist.add(3,4);
        seqlist.add(4,5);
        seqlist.add(5,6);
        seqlist.add(6,7);
        seqlist.add(7,8);
        seqlist.display();
        System.out.println();
        seqlist.add(5,0);
        seqlist.display();
    }
    public static void TestContains(){
        SeqList seqlist=new SeqList();
        seqlist.add(0,12);
        seqlist.add(1,34);
        seqlist.add(2,3);
        seqlist.add(3,43);
        seqlist.add(4,52);
        seqlist.display();
        boolean result=seqlist.contains(3);
        System.out.println();
        System.out.println("result="+result+"   "+"(true表示上面顺序表中有该元素,false则表示没有)");
    }
    public static void TestSearch() {
        SeqList seqlist = new SeqList();
        seqlist.add(0, 1);
        seqlist.add(1, 2);
        seqlist.add(2, 3);
        seqlist.add(3, 4);
        seqlist.add(4, 5);
        seqlist.add(5, 6);
        seqlist.add(6, 7);
        seqlist.add(7, 8);
        seqlist.display();
        int result = seqlist.search(7);
        System.out.println();
        System.out.println("result=" + result + "  " + "(找到了返回下标,没找到返回-1)");
    }
    public static void TestGetPos(){
        SeqList seqlist=new SeqList();
        seqlist.add(0,1);
        seqlist.add(1,2);
        seqlist.add(2,3);
        seqlist.add(3,4);
        seqlist.add(4,5);
        seqlist.add(5,6);
        seqlist.display();
        System.out.println("\n"+"该位置的值="+seqlist.getPos(5));
    }
    public static void TestSetPos(){
        SeqList seqlist = new SeqList();
        seqlist.add(0, 1);
        seqlist.add(1, 2);
        seqlist.add(2, 3);
        seqlist.add(3, 4);
        seqlist.add(4, 5);
        seqlist.add(5, 6);
        seqlist.add(6, 7);
        seqlist.add(7, 8);
        seqlist.display();
        System.out.println();
        seqlist.setPos(5,99);
        seqlist.display();
    }
    public static void TestReMove(){
        SeqList seqlist = new SeqList();
        seqlist.add(0, 80);
        seqlist.add(1, 90);
        seqlist.add(2, 78);
        seqlist.add(3, 97);
        seqlist.add(4, 87);
        seqlist.add(5, 79);
        seqlist.add(6, 67);
        seqlist.add(7, 96);
        seqlist.display();
        System.out.println();
        seqlist.remove(96);
        seqlist.display();
    }
    public static void TestSize(){
        SeqList seqlist=new SeqList();
        seqlist.add(0, 1);
        seqlist.add(1, 2);
        seqlist.add(2, 3);
        seqlist.add(3, 4);
        seqlist.add(4, 5);
        seqlist.add(5, 6);
        seqlist.add(6, 7);
        seqlist.add(7, 8);
        System.out.println(seqlist.size());
    }
    public static void TestClear(){
        SeqList seqlist=new SeqList();
        seqlist.add(0, 1);
        seqlist.add(1, 2);
        seqlist.add(2, 3);
        seqlist.add(3, 4);
        seqlist.add(4, 5);
        seqlist.display();
        seqlist.clear();
        System.out.println("清空后打印一下顺序表");
        seqlist.display();
    }
}
