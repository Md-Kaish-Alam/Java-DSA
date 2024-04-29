package BinarySearch;

public class CeilingOfGivenNo {
    public static void main(String[] args) {
        int[] arr= {2, 3, 5, 9, 14, 16,17, 18};
        int target = 20;
        int ans = ceilingOfNumber(arr, target);
        if (ans == -1) {
            System.out.println("target number is the greater than the greatest no of the array");
        } else {
            System.out.println(arr[ans]);
        }
    }

    // return the index of smallest number >= target
    public static int ceilingOfNumber(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // if the target number is the greater than the greatest no of the array. (Sorted in ascending order)
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        // same approach as binary search algorithm, and instead of return -1 , return startIndex;
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
        return start;
    }

}
