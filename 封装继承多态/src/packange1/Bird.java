package packange1;
//子类
//子类调用父类相同的name字段和eat方法
//extends调用父类,super调用父类的构造方法
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(name + "正在飞");
    }
}

