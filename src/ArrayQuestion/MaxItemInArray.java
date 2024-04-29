package ArrayQuestion;

import java.util.Arrays;

public class MaxItemInArray {

    public static void main(String[] args) {
        int[] arr = {10, 30, 53, 78, 90, 46, 67};
        int start = 1, end = 3;

        System.out.println(Arrays.toString(arr));
        System.out.println("Max Item in Array: " + maxItem(arr));
        System.out.println("Max Item in Array range of " + start + " to " + end + " is: " + (maxItemInRange(arr, start, end)));
    }

    static int maxItem(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }

    static int maxItemInRange(int[] arr, int start, int end) {
        if (end > start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

}
