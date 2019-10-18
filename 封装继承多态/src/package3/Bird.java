package package3;

class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    public void eat(String food){
        System.out.println("i am a bird.");
        System.out.println(name + " eating " + food);
    }
}
