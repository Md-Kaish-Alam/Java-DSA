package SortingAlgorithms;

import java.util.Arrays;

public class CyclicSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swapping(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swapping(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
