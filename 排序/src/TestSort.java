import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class TestSort {
    //时间的复杂度O(n^2) 最坏情况下
    //最好情况下O(n)    有序的情况下
    //     越有序越快
    //   空间复杂度 O(1)
    //稳定性:稳定
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                //如果tmp<array[j] 稳定
                //    tmp<=array[j] 不稳定
                if (tmp < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }

    //时间的复杂度O(n^2)
    public static void bubbleSort(int[] array) {
        //i表示走的趟数,因为拿第一个和后面的比较,所以走数组长度减一趟
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public static void shell(int[] array, int gap) {
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = i - gap;
            for (; j >= 0; j -= gap) {
                //如果tmp<array[j] 稳定
                //    tmp<=array[j] 不稳定
                if (tmp < array[j]) {
                    array[j + gap] = array[j];
                } else {
                    break;
                }
            }
            array[j + gap] = tmp;
        }
    }

    //希尔排序
    /*
     * 时间复杂度O(n^1.5)
     * 不稳定
     * 空间复杂度 O(1)
     * */
    public static void shellSort(int[] array) {
        int[] drr = {5, 3, 1};
        for (int i = 0; i < drr.length; i++) {
            shell(array, drr[i]);
        }

    }

    /*
     * 选择排序
     * 时间复杂度:O(n^2) 对数字不敏感
     *   空间复杂度 O(1)
     * */
    public static void relectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static int partion(int[] array, int low, int high) {
        int tmp = array[low];
        while (low < high) {
            while (low < high && array[high] >= tmp) {
                high--;
            }
            if (low >= high) {
                break;
            } else {
                array[low] = array[high];
            }
            while (low < high && array[low] <= tmp) {
                low++;
            }
            if (low >= high) {
                break;
            } else {
                array[high] = array[low];
            }
        }
        array[low] = tmp;
        return low;
    }

    public static void Swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void threeNumMid(int[] array, int low, int high) {
        int mid = (low + high) / 2;
        if (array[mid] > array[low]) {
            Swap(array, mid, low);
        }
        if (array[mid] > array[high]) {
            Swap(array, mid, high);
        }
        if (array[low] > array[high]) {
            Swap(array, low, high);
        }
    }

    public static void insertSort1(int[] array, int low, int high) {
        for (int i = low + 1; i < high + 1; i++) {
            int tmp = array[i];
            int j = i - 1;
            for (; j >= low; j--) {
                //如果tmp<array[j] 稳定
                //    tmp<=array[j] 不稳定
                if (tmp < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }

    public static void quick(int[] array, int low, int high) {
        if (high - low + 1 <= 100) {
            insertSort1(array, low, high);
            return;
        }
        threeNumMid(array, low, high);
        int par = partion(array, low, high);
        if (par > low + 1) {
            quick(array, low, par - 1);
        }
        if (par < high - 1) {
            quick(array, par + 1, high);
        }

    }

    //非递归的快排
    public static void quickSort1(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int low = 0;
        int high = array.length - 1;
        int par = partion(array, low, high);
        if (par > low + 1) {
            stack.push(low);
            stack.push(par - 1);
        }
        if (par < high - 1) {
            stack.push(par + 1);
            stack.push(high);
        }
        while (!stack.empty()) {
            high = stack.pop();
            low = stack.pop();
            par = partion(array, low, high);
            if (par > low + 1) {
                stack.push(low);
                stack.push(par - 1);
            }
            if (par < high - 1) {
                stack.push(par + 1);
                stack.push(high);
            }
        }
    }

    public static void quickSort(int[] array) {
        quick(array, 0, array.length - 1);
    }

    public static void merge(int[] array, int low, int mid, int high) {
        int s1 = low;
        int s2 = mid + 1;
        int len = high - low + 1;
        int[] tmp = new int[len];
        int i = 0;
        while (s1 <= mid && s2 <= high) {
            if (array[s1] >= array[s2]) {
                tmp[i] = array[s2];
                i++;
                s2++;
            } else {
                tmp[i] = array[s1];
                i++;
                s1++;
            }
        }
        while (s1 <= mid) {
            tmp[i] = array[s1];
            i++;
            s1++;
        }
        while (s2 <= high) {
            tmp[i] = array[s2];
            i++;
            s2++;
        }
        for (int j = 0; j < len; j++) {
            array[low + j] = tmp[j];
        }
    }

    public static void mergeSort(int[] array, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public static void main1(String[] args) {
        Random random = new Random();
        int[] a = new int[1000000];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10000);
        }
        long time1 = System.currentTimeMillis();
        quickSort(a);
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
        //System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = {5, 7, 3, 2, 9, 88, 99, 89, 67, 78, 40, 3, 13, 6, 10};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
