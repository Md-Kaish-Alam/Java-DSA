package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] descendingArray = {33, 20, 14, 12, 9, 6, 5, 3, 2, 1, 0, -1, -2};
        int[] ascendingArray = {-2, -1, 0, 1, 2, 3, 5, 6, 9, 12, 14, 20, 33};
        int target = 33;

        System.out.println("Index of " + target + " in ascending array: " + binarySearch(ascendingArray, target));
        System.out.println("Index of " + target + " in descending array: " + binarySearch(descendingArray, target));
    }

    public static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
