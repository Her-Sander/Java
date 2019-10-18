package package2;
//多层继承,子类可以进一步派生出心得子类(一般不需要超过三层,否则过于复杂)
//如果final修饰父类,则子类不能在继承下去
public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food){
        System.out.println(name + "eating" + food);
    }
}
