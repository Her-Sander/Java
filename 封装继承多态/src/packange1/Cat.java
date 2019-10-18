package packange1;
//子类
//子类调用父类相同的name字段和eat方法
//extends调用父类,super调用父类的构造方法
class Cat extends Animal {
    public Cat(String name) {
        //使用super调用父类的构造方法
        super(name);
    }
}
