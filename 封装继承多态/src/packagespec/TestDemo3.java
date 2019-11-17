package packagespec;
/*
* 1,抽象类没有实现的方法体{}(不能执行具体代码)
* 2,抽象类是包含抽象方法的类
* 3,抽象类可以包含抽象方法也可以包含非抽象方法
* 4,一个普通的类如果继承抽象类那么一定要重写抽象类的方法
* 5,抽象类A可以继承抽象类B,这样就不用重写抽象方法
* 6,抽象方法 不能是private 抽象类一定不能用final修饰(抽象类的意义:为了被继承)
* 7,抽象类不能直接实例化(不允许Shape shape=new Shape()无法实例化)
*    很多与法存在的意义预防出错(抽象类就是如此)
* 抽象类本身不能被实例化,要想使用,可以搞一个子类重写抽象类的方法,再用子类实例化
*/

abstract class Shape1{
    public abstract void draw();
}

abstract class A extends Shape1{

}
class B extends A{
    @Override
    public void draw() {

    }
}

class Cycle1 extends Shape1{
    @Override
    public void draw() {
        System.out.println("画圆");
    }
}

class Rect1 extends Shape1{
    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}

public class TestDemo3 {
    public static void main(String[] args) {
        Shape1 s1=new Cycle1();
        Shape1 s2=new Rect1();
        drawmap(s1);
        drawmap(s2);
    }
    public static void drawmap(Shape1 shape){
        shape.draw();
    }
}
