package BinarySearch;
// https://leetcode.com/problems/split-array-largest-sum

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;

        int ans = splitArray(nums, k);

        System.out.println(ans);
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int num : nums) {
            // at the end of the loop start contain the maximum item of the array.
            start = Math.max(start, num);
            // at the end of the loop end contain the sum of all items of the array.
            end += num;
        }

        // applying binary search in the array [start, end]
        while (start < end) {
            // trying middle as potential ans.
            int mid = start + (end - start) / 2;

            // calculate how many pieces we can divide the nums in with the max sum which is mid
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // we can't add this num in this sub array , then make new sub array.
                    // when we add this num in new sub array,
                    // then the sum of that sub array should be equal to num(sum = num)
                    sum = num;
                    pieces++; // cuz we create new sub array.
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        // here start == end, so we can either return start or end;
        return start;
    }
}
