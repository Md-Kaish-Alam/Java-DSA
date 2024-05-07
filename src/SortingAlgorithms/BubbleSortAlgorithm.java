package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
    public static void bubbleSort(int[] arr) {
        // run the steps (n-1) times
        for (int i = 0; i < arr.length; i++) {
            // for each step, max item of the array will come at the lst respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swapping technique
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    // if the array is already sorted than we have to stop the programs after 1st pass
    public static void bubbleSort2(int[] arr) {
        boolean swapped;
        // run the steps (n-1) times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item of the array will come at the lst respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swapping technique
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
