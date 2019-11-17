package packagespec;
/*
* 自定义的类型   如果进行克隆
* 1,implements cloneable  他是一个空接口
*    面试问题:  cloneable为什么是一个空接口?
*           标记接口->作用:标记当前类可以进行clone();
* 2,重写一个方法:是 Object::clone();
* 3,处理异常
* */
import java.nio.file.ProviderMismatchException;
import java.util.Arrays;

class Money implements Cloneable{
    double money=12.3;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable{
    public String name;
    public int age;
    public Money m;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.m=new Money();
    }

    public Person() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p=(Person) super.clone();
        this.m=(Money) p.m.clone();
        return p;
        //return super.clone();
    }
}


public class TestDemo7 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person=new Person("小雷",18);
        Person person1=(Person) person.clone();
        System.out.println(person.m.money);
        System.out.println(person1.m.money);
        person1.m.money=88.8;
        System.out.println(person.m.money);
        System.out.println(person1.m.money);
    }
        public static void main2(String[] args) throws CloneNotSupportedException {
        Person person=new Person();
        person.name="小刘";
        Person person1=(Person) person.clone();
        person1.name="小雷";
        System.out.println(person.name);
        System.out.println(person1.name);
    }
        public static void main1(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] arr2=arr.clone();
        System.out.println(Arrays.toString(arr2));
    }
}
