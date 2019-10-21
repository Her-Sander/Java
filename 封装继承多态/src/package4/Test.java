package package4;
//多态:一个引用可以表现出不停地形态(同一个方法可以调用不同类中的方法)
//多态的作用:1.类调用者对类的使用成本进一步降低
//			 2.能够降低代码的圈复杂度,避免大量使用if-else
//			 3.可扩展能力强,改动成本低

import java.util.concurrent.Flow;

public class Test {
    public static void main(String[] args) {
//        shape s1=new Cycle();
//        shape s2=new Rect();
//        shape s3=new Flowers();
//        draw(s1);
//        draw(s2);
//        draw(s3);
//        draws1();
        drawshape();
    }
    public static void draw(Shape s){
        //多态方法的理解
        s.draw();
    }
    public static void draws1(){
        //不适用多态方法
        Cycle cycle=new Cycle();
        Rect rect=new Rect();
        Flowers flowers=new Flowers();

        String[] shapes={
                "rect","flowers","cycle","flowers","flowers","rect"
        };
        for(String shape : shapes) {
            if (shape.equals("cycle")) {
                cycle.draw();
            } else if (shape.equals("flowers")) {
                flowers.draw();
            } else if(shape.equals("rect")){
                rect.draw();
            }
        }
    }
    public static void drawshape(){
        //使用多态方法完成
        Shape[] shapes={
                new Rect(),
                new Flowers(),
                new Cycle(),
                new Flowers(),
                new Flowers(),
                new Rect()
        };
        for(Shape shape : shapes){
            shape.draw();
        }
    }
}
