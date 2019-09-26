public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] ar={9,8,7,6,5,4,3,2,1};
        int[] a={2,8,9,6,1,7,3};
        System.out.println(isSorted(arr));
        System.out.println(isSorted(ar));
        System.out.println(isSorted(a));
    }
    public static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            //判断数组是否从小到大排列
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        //如果每次前一个数都小于后一个数则数组升序排序
        //不满足判断条件,不进入if,循环结束返回true
        //如判断降序排序,将判断的'>'改成'<'即可
        //说明每次的前一个数不小于即大于后一个数
        return true;
    }
}
