public class Test {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int ret = binarysearch(a, 4);
        System.out.println(ret);
    }

    public static int binarysearch(int[] arr, int tofind) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < tofind) {
                left = mid + 1;
            } else if (arr[mid] > tofind) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
