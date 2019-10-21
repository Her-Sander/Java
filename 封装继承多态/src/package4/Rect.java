package package4;
//Override:重写  作用:1.校验代码的正确性 2.提示该方法为重写
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("□");
    }
}
