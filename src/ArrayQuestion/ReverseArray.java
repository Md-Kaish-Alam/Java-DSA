package ArrayQuestion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverseArray(arr)));

    }
    static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        return arr;
    }

    static void swap(int[] arr, int fisrtIndex, int secIndex) {
        int temp = arr[fisrtIndex];
        arr[fisrtIndex] = arr[secIndex];
        arr[secIndex] = temp;
    }
}
