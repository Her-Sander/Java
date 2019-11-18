import java.util.Arrays;
/*
*  1.什么都可以放
*  2.拿到元素的时候强转
* */
class MyArrayList{
    public Object[] elem;
    public int usedSize;

    public MyArrayList(){
        this.elem = new Object[10];
        this.usedSize = usedSize;
    }
    public void add(Object data){
        this.elem[this.usedSize]=data;
        this.usedSize++;
    }

    public Object getpos(int pos){
        return this.elem[pos];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elem=" + Arrays.toString(elem) +
                ", usedSize=" + usedSize +
                '}';
    }
}
class Person2{

}
public class TestDemo2 {
    public static  void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add("xiaoliu");
        myArrayList.add(new Person2());
        int a = (int) myArrayList.getpos(0);
        Person2 person2 = (Person2) myArrayList.getpos(3);
        System.out.println(myArrayList.toString());
    }
}
