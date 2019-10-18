package package4;
//多态:一个引用可以表现出不停地形态(同一个方法可以调用不同类中的方法)
class shape{
    public void draw(){
    }
}

public class Test {
    public static void main(String[] args) {
        shape s1=new Cycle();
        shape s2=new Cent();
        shape s3=new Flowers();
        draw(s1);
        draw(s2);
        draw(s3);
    }
    public static void draw(shape s){
        s.draw();
    }
}
