package packagespec;

class Shape{
    public void draw(){

    }
}

class Cycle extends Shape{
    @Override
    public void draw() {
        //super.draw();
        System.out.println("画圆");
    }
}

class Rect extends Shape{
    @Override
    public void draw() {
        //super.draw();
        System.out.println("画矩形");
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        Shape s1=new Cycle();
        Shape s2=new Rect();
        drawMap(s1);
        drawMap(s2);
    }
    public static void drawMap(Shape shape){
        shape.draw();
    }
}
