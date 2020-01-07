package packagespec;

//继承:代码的复用
//  extends(扩展):指当前有了一定的功能,进一步扩充功能
//  implements(接口):什么功能都没有,需要从头构造
class Animal{
    public String name;
    public int age;

    static{
        System.out.println("Animal::static{}");
    }
    {
        System.out.println("Animal::instance{}");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal(String name, int age)");
    }

    public void eat(){
        System.out.println("Animal::eat()");
    }
}

class Cat extends Animal{
    public String sex;
    static{
        System.out.println("Cat::static{}");
    }
    {
        System.out.println("Cat::instance{}");
    }

    public Cat(String name, int age ,String sex) {
        super(name, age);
        this.sex = sex;
        System.out.println("Cat(String name, int age ,String sex)");
    }

    public void eat(){
        System.out.println("Cat::eat()");
    }

    public void run(){
        System.out.println("Cat::run");
    }
}

class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(super.age);
        super.eat();
        System.out.println("Bird::fly()");
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Animal animal=new Bird("麻雀",18);
        //向下转型-》一定要发生向上转型-》instanceof
//        if(animal instanceof Cat ) {
//            Cat cat = (Cat) animal;
//            cat.run();
//        }
        Bird b=(Bird)animal;
        b.fly();
    }

    public static void main3(String[] args) {
        //向上转型:父类的引用指向子类的实例
        Animal animal=new Cat("xiaohua", 18, "famale");
        //向下转型:子类的引用指向父类的实例
        Cat cat=(Cat)animal;
        cat.run();
    }

    public static void main1(String[] args) {
        //=====静态方法只调用一次======
        //父类静态->子类静态->父类实例->父类构造->子类实例->子类构造
        Cat cat = new Cat("xiaohua", 18, "famale");
        System.out.println("==============");
        //父类实例父类构造->子类实例子类构造
        Cat cat2 = new Cat("xiaohua", 18, "famale");
    }

    public static void main2(String[] args) {
        Cat cat=new Cat("xiaohua",18,"famale");
        cat.eat();
    }
}
