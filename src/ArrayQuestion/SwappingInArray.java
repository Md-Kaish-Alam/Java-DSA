package ArrayQuestion;

import java.util.Arrays;

public class SwappingInArray {
    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 6, 8};

        int firstIndex = 2;
        int secIndex = 4;

        System.out.println(Arrays.toString(arr));

        int[] result = swap(arr, firstIndex, secIndex);

        System.out.println(Arrays.toString(result));
    }

    static int[] swap(int[] arr, int firstIndex, int secIndex) {

        int temp = arr[firstIndex];

        arr[firstIndex] = arr[secIndex];
        arr[secIndex] = temp;

        return arr;
    }
}