package packagespec;
/*
* 1,接口中的方法一定不能具体的实现 抽象方法
* 2,void draw()->默认:public abstract void draw();
*  接口中只能包含抽象方法,所以接口中的字段只能用静态常亮(final static)
* 3,int a=10;->默认:public static final int a=10;
* 4,普通的类可以使用implements继承接口
*   此时表示的含义不是"扩展(extends)",而是"实现(implements)"
*   extends(扩展):指当前有了一定的功能,进一步扩充功能
*   implements(接口):什么功能都没有,需要从头构造
* 5,抽象类可以继承接口
* 6,接口不可以实例化,但可以向上转型
* 7,一个类可以实现多个接口
* 8,接口和接口之间不能发生实现,但是他们直接可以实现继承
*   interface C extends A,B   A和B均为接口
* */

interface IShape{
    void draw();
}

class Cycle2 implements IShape{
    @Override
    public void draw() {
        System.out.println("画圆");
    }
}

class Rect2 implements IShape{
    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}

public class TestDemo4 {
    public static void main(String[] args) {
        IShape s1 = new Cycle2();
        IShape s2 = new Rect2();
        s1.draw();
        s2.draw();
    }
}
