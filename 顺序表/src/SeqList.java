public class SeqList {
    private int[] arr=new int[10];
    private int size=0;
    public void display(){
        if(size>10) {
        return;
        }
        System.out.print("[");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
            if(i<size-1){
                System.out.print(" ,");
            }
        }
        System.out.print("]");
    }
    public void add(int pos,int value){
        if(pos>(arr.length-1)||pos<0){
            return;
        }
        if(size>=arr.length){
            realloc();
        }
        if(pos==size){
            arr[pos]=value;
            size++;
        }else{
            for(int i=size;i>pos;i--){
                arr[i]=arr[i-1];
            }
            arr[pos]=value;
            size++;
        }
    }
    public void realloc(){
        int[] newarr=new int[this.arr.length*2];
        for (int i = 0; i <this.arr.length ; i++) {
            newarr[i]=this.arr[i];
        }
        this.arr=newarr;
    }
    public boolean contains(int tofind){
        for (int i = 0; i < this.size; i++) {
            if(this.arr[i]==tofind){
                return true;
            }
        }
        return false;
    }
    public int search(int tofind){
        for (int pos = 0; pos < this.size; pos++) {
            if(this.arr[pos]==tofind){
                return pos;
            }
        }
        return -1;
    }
    public int getPos(int pos){
        return this.arr[pos];
    }
    public void setPos(int pos,int value){
        if(pos<0||pos>this.size){
            return;
        }
        this.arr[pos]=value;
    }
    public void remove(int toremove){
        int pos=search(toremove);
        if(pos==-1){
            return;
        }
        else if(pos==this.size-1){
            this.size--;
            return;
        }
        else {
            for(int i=pos;i<this.size-1;i++){
                this.arr[i]=this.arr[i+1];
            }
            size--;
        }
    }
    public int  size(){
        return this.size;
    }
    public void clear(){
        this.size=0;
        this.arr=new int[10];
    }
}
