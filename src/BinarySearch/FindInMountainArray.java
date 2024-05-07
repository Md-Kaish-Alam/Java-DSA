package BinarySearch;
// https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;

        // in the above array the smallest index of the target value 3 is 2
        // so the answer is 2;

        int answerIndex = searchInMountainArr(target, arr);

        System.out.println(answerIndex);
    }

    public static int searchInMountainArr(int target, int[] arr) {
        int peakIndex = peakIndexInMountainArray(arr);

        int first = orderAgnosticBinarySearch(arr, target, 0, peakIndex);

        if (first != -1) {
            return first;
        }

        int sec = orderAgnosticBinarySearch(arr, target, peakIndex + 1, arr.length - 1);

        if (sec != -1) {
            return sec;
        }

        return -1;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
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
