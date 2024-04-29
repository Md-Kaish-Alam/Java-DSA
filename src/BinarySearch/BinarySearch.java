package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -9, -7, 10, 29, 45, 67, 78, 90, 99};
        int target = 67;
        int ans = binarySearching(arr, target);
        System.out.println(arr[ans] + " at index " + ans);
    }

    private static int binarySearching(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle index
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                // index founded
                return mid;
            }
        }
        return -1;
    }
}
