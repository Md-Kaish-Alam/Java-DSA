package BinarySearch;

public class FloorOfGivenNo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 17, 18};
        int target = 15;
        int ans = floorOfGiveNo(arr, target);
        if (ans == -1) {
            System.out.println("target number is the smaller than the smallest no of the array");
        } else {
            System.out.println(arr[ans]);
        }
    }

    // return the index of greatest number <= target
    public static int floorOfGiveNo(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // if the target number is the smaller than the smallest no of the array. (Sorted in ascending order)
        if (target < arr[0]) {
            return -1;
        }

        // same approach as binary search algorithm, and instead of return -1 , return endIndex;
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
        return end;
    }

}
