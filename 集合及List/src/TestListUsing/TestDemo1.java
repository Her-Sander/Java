package TestListUsing;
/*
*   list.add():尾插  list.add(index k,T t):在k位置插入(注意不要越界)
*   list.addAll(c):尾插c中的元素
*   list.remove(0):删除该下标的元素(注意不要越界)
*   list.remove("xiaolei"):删除该对象
*   list.get(0):获取改下标的元素(注意不要越界)
*   list.set(1,"Rocket"):设置该下标(注意不要越界)
*   list.indexOf("Rocket"):返回该对象第一个元素的下标
*   list.indexOf("Rocket"):返回该对象最后一个元素的下标
*   list.subList(1,3):截取该list下标[1,3)之间的元素(注意区间为左闭右开)
* */

import java.util.ArrayList;
import java.util.List;

public class TestDemo1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(10);
        list.add("hello");
        list.add(1,"nihao");
        System.out.println("输出list的内容");
        System.out.println(list);

        List<String> list1=new ArrayList<>(10);
        list1.add("xiaolei");
        list1.add("xiaogao");
        System.out.println("输出list1的内容");
        System.out.println(list1);
        list.addAll(list1);
        System.out.println("=============");
        System.out.println(list);

        System.out.println("=====删除list=====");
        String str=list.remove(0);
        System.out.println(str);
        System.out.println(list);
        System.out.println("=====删除list对象=====");
        list.remove("xiaolei");
        System.out.println(list);

        System.out.println("=====get=====");
        String str1=list.get(0);
        System.out.println(str1);
        System.out.println(list);

        System.out.println("=====set=====");
        list.set(1,"Rocket");
        System.out.println(list);
        int index = list.indexOf("Rocket");
        System.out.println(index);

        System.out.println("添加");
        list.add("hello");
        list.add("hello");
        list.add("qq");
        System.out.println(list);
        index = list.lastIndexOf("hello");
        System.out.println(index);

        System.out.println("截取");
        List<String> list3 = list.subList(1,3);
        System.out.println(list3);
        list3.set(0,"rocket");
        System.out.println("修改截取后的list3");
        System.out.println(list3);
    }
}
