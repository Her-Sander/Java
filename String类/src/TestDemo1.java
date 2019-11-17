public class TestDemo1 {
    //理解字符串的不可变   地址
    public static void main(String[] args) {
        String str = "hello" ;
        System.out.println(Integer.toHexString(str.hashCode()));
        str = str + " world" ;
        System.out.println(Integer.toHexString(str.hashCode()));
        str += "!!!" ;
        System.out.println(Integer.toHexString(str.hashCode()));
        System.out.println(str);

        String str2 = "hello";
        System.out.println(str2.equals(str));
    }
    //inter():手工入池
    public static void main5(String[] args) {
        String str="abcd";
        //inter(): native 底层的 c/c++  手工入池
        //inter 可以理解为 在常量池中寻找和abcd相等的对象,然后将其引用指向str1
        //用inter()必须将其指向一个引用
        //String str1=new String("abcd").intern();
        String str1=new String("abcd");
        //构造方法会开辟两块内存区间
        String str2=str1.intern();
        System.out.println(str==str2);
    }

    public static void main4(String[] args) {
        String str=null;
        //if(str.equals("abcde")){
        //这里注意和空指针比较将空指针放在equals括号内,避免空指针异常
        if("abcde".equals(str)){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
    }

    //字符串判断相等 ==  equals
    public static void main3(String[] args) {
        String str1 = "abcdef";
        String str2 = new String("abcdef");
        System.out.println(str1 == str2);//false

        String str3 = new String("abcdef");
        System.out.println(str2 == str3);//false

        String str4 = "ab"+"cdef";//abcdef   final int a = 10
        System.out.println(str1 == str4);//true
        //两个字符串拼接+  编译器在编译期间就处理为(拼接+)的结果

        String str5 = "ab" + new String("cdef");
        System.out.println(str1 == str5);//false
        System.out.println(str1.equals(str5));//true
        System.out.println(str5);

        String str6 = "ab";
        String str7 = "cdef";
        String str8 = str6+str7;
        System.out.println(str1 == str8);//false
        System.out.println(str1.equals(str8));//true

        String str9 = str6+"cdef";
        System.out.println(str1 == str9);//false

        String str10 = "hello" + 10;//"hello10"
        String str11 = "hello10";
        System.out.println(str10 == str11);//true
    }
    public static void main2(String[] args) {
        //字符串在内存当中的存储
        //==比较的是两个引用是否指向同一个对象
        //equals比较的是对象的值是否相等
        String str1="abcdef";
        String str2="abcdef";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        String str3=new String("abcdef");
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
    }
    public static void main1(String[] args) {
        //三种字符串对象的构造方法
        String str="hello";
        System.out.println(str);

        String str1=new String("hello");
        System.out.println(str1);

        char[] ch={'a',98,99,100};
        String str2=new String(ch);
        System.out.println(str2);
    }
}
