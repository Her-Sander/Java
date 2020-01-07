import java.lang.reflect.Parameter;
import java.util.Arrays;

public class TestHeap {
    public int[] elem;
    public int usedSize;

    public TestHeap(){
        this.elem=new int[20];
        this.usedSize=0;
    }

    //一次调整
    //root 每次调整的根节点坐标
    public void adjustDown(int root,int len){
        int parent = root;
        int child = 2*parent+1;
        while(child < len){
            //判断是否有右孩子 且谁最大
            if(child+1<len&&elem[child]<elem[child+1]){
                child=child+1;
            }
            //child肯定是左右孩子的最大值
            if(elem[child]>elem[parent]){
                int tmp=elem[child];
                elem[child]=elem[parent];
                elem[parent]=tmp;
                parent=child;
                child=2*parent+1;
            }else{
                break;
            }
        }
    }

    public void creatHeap(int array[]){
        for(int i=0;i<array.length;i++){
            this.elem[i] =array[i];
            this.usedSize++;
        }

        for(int i=(this.usedSize-1-1)/2;i>=0;i--)
        adjustDown(i,this.usedSize);
    }
    public void adjustUp(int child){
        int parent=(child-1)/2;
        while(child>0){
            if(this.elem[child]>this.elem[parent]){
                int tmp=this.elem[child];
                this.elem[child]=this.elem[parent];
                this.elem[parent]=tmp;
                child=parent;
                parent=(child-1)/2;
            }else {
                break;
            }
        }

    }
    public boolean isFull(){
        return this.usedSize==this.elem.length;
    }

    public void pushHeap(int val){
        if(isFull()){
            this.elem= Arrays.copyOf
                    (this.elem,this.elem.length*2);
        }
        this.elem[usedSize]=val;
        this.usedSize++;
        adjustUp(usedSize-1);
    }
    public boolean isEmpty(){
        return this.usedSize==0;
    }
    public void popHeap(){
        if(isEmpty()){
            return;
        }
        int tmp=this.elem[0];
        this.elem[0]=this.elem[this.usedSize-1];
        this.elem[this.usedSize-1]=tmp;
        this.usedSize--;
        adjustDown(0,usedSize);
    }
    public int getPop(){
        if(isEmpty()){
            return -1;
        }
        return this.elem[0];
    }
    public void display(){
        for(int i =0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    public void heapSort(){
        int end=this.usedSize-1;
        while (end>0){
            int tmp=this.elem[0];
            this.elem[0]=this.elem[end];
            this.elem[end]=tmp;
            adjustDown(0,end);
            end--;
        }
    }

}

