import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //设置一个随机数
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        //设置要猜的数的范围里的随机数
        int toGuess=random.nextInt(100);
        while(true) {
            System.out.println("请输入要猜的数字1-100: ");
            //接收输入的数
            int i = sc.nextInt();
            if(i<0||i>100) {
                System.out.println("铁汁,请擦亮眼镜再看一遍!!!");
            }
            else if (i > toGuess) {
                System.out.println("猜大了");
            } else if (i < toGuess) {
                System.out.println("猜小了");
            } else {
                System.out.println("铁汁,你猜对了");
                break;
            }
        }
        //循环结束,接收输入的数完毕,游戏结束
        sc.close();
    }
}
