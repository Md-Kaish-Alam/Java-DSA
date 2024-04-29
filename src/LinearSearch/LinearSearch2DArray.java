package LinearSearch;

import java.util.Arrays;

public class LinearSearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 39, 67, 64, 56},
                {45, 78, 56, 78, 56, 34},
                {34, 20, 76, 90, 99}
        };

        int target = 99;
        int[] ans = searchIn2DArray(arr, target);

        System.out.println(Arrays.toString(ans));
        System.out.println("Max No:" + max(arr));
    }

    public static int[] searchIn2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }

        return max;
    }
}
