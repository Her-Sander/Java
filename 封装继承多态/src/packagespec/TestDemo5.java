package packagespec;
//实现多接口
class animal{
    protected String name;

    public animal(String name) {
        this.name = name;
    }
}

interface IRunning{
    void run();
}

interface ISwimming{
    void swim();
}

interface IFlying{
    void fly();
}

class Dog extends animal implements IRunning{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }
}

class Frog extends animal implements ISwimming,IRunning{
    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在游泳");
    }
}

class Dusk extends animal implements IRunning,ISwimming,IFlying{
    public Dusk(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name+"正在飞");
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在游泳");
    }

}

public class TestDemo5 {
    public static void main(String[] args) {
        Dog dog=new Dog("旺旺");
        Frog frog=new Frog("呱呱");
        Dusk dusk=new Dusk("天鹅");
        fun1(dog);
        fun1(frog);
        fun2(frog);
        fun1(dusk);
        fun2(dusk);
        fun3(dusk);
    }
    public static void fun1(IRunning running){
        running.run();
    }
    public static void fun2(ISwimming swimming){
        swimming.swim();
    }
    public static void fun3(IFlying flying){
        flying.fly();
    }
}
