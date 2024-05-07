package BinarySearch;

import java.util.Arrays;

// Searching in strictly sorted matrix
public class SearchingInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 16;
        System.out.println(Arrays.toString(searchingInMatrix(matrix, target)));
    }

    public static int[] searchingInMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty

        // if we have one element in row
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;

        int colMid = cols / 2;

        // run the loop till 2 rows remaining.

        while (rowStart < (rowEnd  - 1)) { // while this is true it will have more than 2 rows
            int mid = rowStart + (rowEnd - rowStart) / 2;

            if (matrix[mid][colMid] == target) {
                return new int[]{mid, colMid};
            }

            if (matrix[mid][colMid] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        // now we have 2 rows;
        // check whether the target is in the col of 2 rows

        if (matrix[rowStart][colMid] == target) {
            return new int[]{rowStart, colMid};
        }

        if (matrix[rowStart + 1][colMid] == target) {
            return new int[]{rowStart + 1, colMid};
        }

        // otherwise search in rest 4 parts

        // search in 1st part
        if (target <= matrix[rowStart][colMid - 1]) {
            return binarySearch(matrix, rowStart, 0, colMid - 1, target);
        }
        // search in 2nd part
        if (target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][cols - 1]) {
            return binarySearch(matrix, rowStart, colMid + 1, cols - 1, target);
        }
        // search in 3rd part
        if (target <= matrix[rowStart + 1][colMid - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, colMid - 1, target);
        }
        // search in 4th part
        if (target >= matrix[rowStart + 1][colMid + 1]) {
            return binarySearch(matrix, rowStart + 1, colMid + 1, cols - 1, target);
        }



        return new int[]{-1, -1};
    }

    // search in the row provided between the cols provided.
    public static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }

            if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}
