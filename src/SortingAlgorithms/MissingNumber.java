package SortingAlgorithms;
// https://leetcode.com/problems/missing-number/

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swapping(nums, i, correct);
            } else {
                i++;
            }
        }

        // find the missing element
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }

        return nums.length;
    }

    public static void swapping(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
