package BinarySearch;

import java.util.Arrays;

// Matrix is sorted in a row wise and col wise manner.

public class SearchingInMatrixRowAndColWiseSorted {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        int target = 49;

        System.out.println(Arrays.toString(searchingInSortedMatrix(matrix, target))); // ans [2, 3]
    }

    public static int[] searchingInSortedMatrix(int[][] matrix, int target) {
        int row = 0; // start
        int col = matrix.length - 1; // end

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }

            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }


        return new int[]{-1, -1};
    }
}
