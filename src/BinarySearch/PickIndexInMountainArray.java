package BinarySearch;
// Leetcode question no : 852
// https://leetcode.com/problems/peak-index-in-a-mountain-array
public class PickIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 4, 3,2};

        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // we are in desc part of the array , "mid" may be the possible ans, but we have to check at left side;
                // so, end != mid - 1;
                end = mid;
            } else {
                // we are in asc part of the array, "mid" may be the possible ans, but we have to check at right side;
                start = mid + 1;
            }
        }

        // At the last, start == end both pointing to the largest no of the array;
        return start;
    }
}

// in this example it's return index no 5, that is element 7 which is correct.