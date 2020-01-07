import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestDemo {
    public static void main1(String[] args) {
        //优先级队列底层是一个小根堆
        //入队:放到最后,向上调整  出队:出第一个,头尾交换,usedsize-1,向下调整
        Queue<Integer> queue=new PriorityQueue<>();
        queue.offer(12);
        queue.offer(8);
        queue.offer(90);
        int ret=queue.poll();
        System.out.println(ret);

    }
        public static void main(String[] args) {
        int[] array={11,12,15,13,9,10,2,7,8,6};
        TestHeap testHeap=new TestHeap();
        testHeap.creatHeap(array);
//        testHeap.display();
//        testHeap.pushHeap(14);
//        testHeap.display();
//        testHeap.popHeap();
//        testHeap.display();
//        int ret=testHeap.getPop();
//        System.out.println(ret);
        testHeap.display();
        testHeap.heapSort();
        testHeap.display();
    }
}
