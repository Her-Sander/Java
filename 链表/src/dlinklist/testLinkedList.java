package dlinklist;

import com.sun.management.VMOption;

import javax.swing.plaf.SliderUI;

public class testLinkedList {
    public static void main(String[] args) {
        testAddFirst();
        testAddLast();
        testAddIndex();
        testContains();
        testRemove();
        testRemoveAll();
        testclear();
    }
    public static void testAddFirst(){
        System.out.println("测试双链表头插");
        DLinkedList dlist=new DLinkedList();
        dlist.addFirst(1);
        dlist.addFirst(2);
        dlist.addFirst(3);
        dlist.addFirst(4);
        dlist.display();
    }
    public static void testAddLast(){
        System.out.println("测试尾插");
        DLinkedList dlist=new DLinkedList();
        dlist.addLast(1);
        dlist.addLast(2);
        dlist.addLast(3);
        dlist.addLast(4);
        dlist.display();
    }
    public static void testAddIndex(){
        System.out.println("测试任意位置的插入");
        DLinkedList dlist=new DLinkedList();
        dlist.addLast(1);
        dlist.addLast(2);
        dlist.addLast(3);
        dlist.addLast(4);
        dlist.display();
        dlist.addIndex(4,6);
        dlist.display();
    }
    public static void testContains(){
        System.out.println("测试是否包含");
        DLinkedList dlist=new DLinkedList();
        dlist.addLast(1);
        dlist.addLast(2);
        dlist.addLast(3);
        dlist.addLast(4);
        dlist.display();
        boolean a=dlist.Contains(4);
        System.out.println(a);
    }
    public static void testRemove(){
        System.out.println("测试删除给定的值");
        DLinkedList dlist=new DLinkedList();
        dlist.addLast(1);
        dlist.addLast(2);
        dlist.addLast(3);
        dlist.addLast(4);
        dlist.display();
        dlist.remove(1);
        dlist.display();
    }
    public static void testRemoveAll(){
        System.out.println("测试删除所有给定的值");
        DLinkedList dlist=new DLinkedList();
        dlist.addLast(1);
        dlist.addLast(2);
        dlist.addLast(3);
        dlist.addLast(4);
        dlist.addLast(5);
        dlist.addLast(5);
        dlist.display();
        dlist.removeAll(5);
        dlist.display();
    }
    public static void testclear(){
        System.out.println("测试清空双链表");
        DLinkedList dlist=new DLinkedList();
        dlist.addLast(1);
        dlist.addLast(2);
        dlist.addLast(3);
        dlist.addLast(4);
        System.out.println("清空前");
        dlist.display();
        dlist.clear();
        dlist.display();
        System.out.println("清空后");
    }
}
