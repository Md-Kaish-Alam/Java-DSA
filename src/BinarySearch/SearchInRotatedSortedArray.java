package BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(searchInRotatedSortedArray(arr, target));
    }

    public static int searchInRotatedSortedArray(int[] arr, int target) {
        int pivot = findPivot(arr);

        int firstHalf = binarySearchInRange(arr, target, 0, pivot);

        if (firstHalf != -1) {
            return firstHalf;
        }

        return binarySearchInRange(arr, target, pivot + 1, arr.length - 1);
    }

    public static int binarySearchInRange(int[] arr, int target, int start, int end) {
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

    // this will not work in duplicate values
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 case will be here.

            // Case 1: arr[mid] > arr[mid + 1] , then pivot will be mid;
            // here if the arr[mid] be the last element or only element of the array
            // then arr[mid+ 1] should give the array index out of bound error : so we have to check mid < end first.
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: arr[mid] < arr[mid - 1] , then pivot will be mid - 1;
            // here if the arr[mid] be the first and only single element in the array
            // then arr[mid - 1] should give the array index out of bound error: So we have to first check mid > start.
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: if arr[start] >= arr[mid] => end = mid - 1;
            // In this case all element from mid will be smaller than start, Hence we can ignore all these elements.
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                // Case 4: if arr[start] < arr[mid] then start = mid + 1;
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 case will be here.

            // Case 1: arr[mid] > arr[mid + 1] , then pivot will be mid;
            // here if the arr[mid] be the last element or only element of the array
            // then arr[mid+ 1] should give the array index out of bound error : so we have to check mid < end first.
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: arr[mid] < arr[mid - 1] , then pivot will be mid - 1;
            // here if the arr[mid] be the first and only single element in the array
            // then arr[mid - 1] should give the array index out of bound error: So we have to first check mid > start.
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if elements in start, middle and end are equals then, just skip the duplicates.
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates

                // Note: What if the elements at start and end were the pivot ?
                // check if start is pivot:
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check if end is pivot:
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
