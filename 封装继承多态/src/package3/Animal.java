package package3;

public class Animal {
    String name;

    public Animal(String name){
        this.name=name;
    }

    public void eat(String food){
        System.out.println("i am an animal.");
        System.out.println(name + " eating " + food);
    }
}
