public class TestDemo4 {
    public static void main(String[] args) {
        Integer a = 128;//自动装箱
        Integer b = 128;
        System.out.println(a==b);//装箱后不相等 因为等同于new了一个新对象
        //而拆箱后值相等
        //System.out.println(a.intValue() == b.intValue());
    }

    public static void main3(String[] args) {
        Integer integer = new Integer("123");//双引号内只能放数字
        System.out.println(integer);
    }
    public static void main2(String[] args) {
        int a=10;
        Integer i=Integer.valueOf(a);//手动装箱
        Integer integer=a;
        int n=integer.intValue();//手动拆箱
        Double d=integer.doubleValue();

        System.out.println(n);
        System.out.println(d);
        System.out.println(i);


    }
    public static void main1(String[] args) {
        //int a=10;
        Integer i= 10;//自动装箱->Integer.ValueOf
        System.out.println(i);
        int a=i;//自动拆箱->intValue
        System.out.println(a);
    }
}
