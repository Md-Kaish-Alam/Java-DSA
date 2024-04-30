package BinarySearch;
// Amazon interview question
public class FindPositionOfNoInInfiniteArray {
    public static void main(String[] args) {
        // consider that the arr is the infinite size, so we can't use the method length of the array (arr.length can't use)
        int[] arr = {10, 20, 30, 35, 36, 38, 39, 40, 42};
        int target = 36;

        System.out.println(findPosition(arr, target));
    }

    public static int findPosition(int[] arr, int target) {
        // first find the range to use the binary search
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            // double the range value
            int temp = end + 1; // this is new start
            // end = previous end + size of the previous range
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
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
