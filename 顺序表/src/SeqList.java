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
    //在指定的位置插入相应的值,size是数组的有效元素,成功插入则size++
    public void add(int pos,int value){
        //坐标越界,直接返回
        if(pos>(arr.length-1)||pos<0){
            return;
        }
        //如果坐标大于数组的最大容量,扩容
        if(size>=arr.length){
            realloc();
        }
        //尾插
        else if(pos==size){
            arr[pos]=value;
            size++;
        }
        //将插入的位置的值后面的值依次挪到当前位置的下一位
        else{
            for(int i=size;i>pos;i--){
                arr[i]=arr[i-1];
            }
            arr[pos]=value;
            size++;
        }
    }
    //扩容
    public void realloc(){
        int[] newarr=new int[this.arr.length*2];
        for (int i = 0; i <this.arr.length ; i++) {
            newarr[i]=this.arr[i];
        }
        this.arr=newarr;
    }
    //顺序表中是否包含某一元素
    public boolean contains(int tofind){
        for (int i = 0; i < this.size; i++) {
            if(this.arr[i]==tofind){
                return true;
            }
        }
        return false;
    }
    //查找顺序表中某一元素的位置
    public int search(int tofind){
        for (int pos = 0; pos < this.size; pos++) {
            if(this.arr[pos]==tofind){
                return pos;
            }
        }
        return -1;
    }
    //获得顺序表中指定位置的值
    public int getPos(int pos){
        return this.arr[pos];
    }
    //设置顺序表中指定位置的值
    public void setPos(int pos,int value){
        if(pos<0||pos>this.size){
            return;
        }
        this.arr[pos]=value;
    }
    //删除顺序表中的指定值
    public void remove(int toremove){
        //先找到该值的位置,然后确定删除方法
        int pos=search(toremove);
        if(pos==-1){
            return;
        }
        //尾删
        else if(pos==this.size-1){
            this.size--;
            return;
        }
        //删除任意位置,将指定位置的后面位置的值依次往前挪
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
    //清空
    public void clear(){
        this.size=0;
        this.arr=new int[10];
    }
}
