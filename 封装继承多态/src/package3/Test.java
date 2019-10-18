package package3;
//java调用哪个类中的方法取决于引用指向的类型的实例(即new 后面的类型的方法)
//这个过程是程序运行时决定的(不是编译时),称为{[动态绑定]}
public class Test {
    public static void main(String[] args) {
        Animal animal=new Bird("smallcycle");
        animal.eat("worm");
        Animal bird=new Animal("smallblack");
        bird.eat("meat");
    }
}
