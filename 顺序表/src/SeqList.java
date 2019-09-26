public class SeqList {
    private int[] arr=new int[10];
    private int size=0;
    public void display(int[] arr,int size){
        if(size>10) {
        return;
        }
        System.out.println("[");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
            if(i<size-1){
                System.out.print(", ");
            }
            System.out.print("]");
        }
    }
}
