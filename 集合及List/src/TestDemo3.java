/*
*   泛型的意义:
*      1.自动进行类型的检查(并不是进行类型的替换)
*          只是拿着你给的类型进行检查
*      2.自动进行类型的强制类型转换
*
* */

import java.util.Arrays;

class MyArrayList2<T>{
    public T[] elem;
    public int useSize;
    public MyArrayList2(){
        this.elem=(T[])new Object[10];
        this.useSize=0;
    }
    public void add(T data){
        this.elem[this.useSize]=data;
        this.useSize++;
    }
    public T getPos(int pos){
        return this.elem[pos];
    }

    @Override
    public String toString() {
        return "MyArrayList2{" +
                "elem=" + Arrays.toString(elem) +
                ", useSize=" + useSize +
                '}';
    }
}
public class TestDemo3 {
    public static void main3(String[] args) {
        MyArrayList2<String> myArrayList2 = new MyArrayList2<>();
        MyArrayList2<Person> myArrayList3 = new MyArrayList2<>();
        MyArrayList2<Integer> myArrayList4 = new MyArrayList2<>();
        myArrayList4.add(10);
        MyArrayList2<Character> myArrayList5 = new MyArrayList2<>();

        System.out.println(myArrayList2);
        System.out.println(myArrayList3);
    }

    public static void main(String[] args) {
        MyArrayList2<String> myArrayList2 = new MyArrayList2<>();
        myArrayList2.add("gaobo");
        System.out.println(myArrayList2);

        Person2 person2 = new Person2();

        System.out.println(person2);
    }

    public static void main1(String[] args) {
        MyArrayList2<String> myArrayList2=new MyArrayList2<>();
        myArrayList2.add("gaobao");
        //进行类型检查  拿着你给的类型检查
        //myArrayList2.add(10);
        myArrayList2.add("哈喽");
        String str=myArrayList2.getPos(0);
        System.out.println(str);
    }
}
