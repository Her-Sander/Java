import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr={3,5,7,1,6,0,8,2,9};
        bubblesort(arr);
        //Java自带的数组排序的方法
        //Arrays.sort(arr);
        //Java自带打印数组的函数
        System.out.println(Arrays.toString(arr));
    }
    public static void bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int cur=arr.length-1;cur>i;cur--){
                if(arr[cur-1]>arr[cur]){
                    int tmp=arr[cur];
                    arr[cur]=arr[cur-1];
                    arr[cur-1]=tmp;
                }
            }
        }
    }
}
