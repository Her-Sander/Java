package packange1;
//继承
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("small black");
        cat.eat("cat food");
        Bird bird = new Bird("small cycle");
        bird.eat("worm(虫子)");
        bird.fly();
    }
}

