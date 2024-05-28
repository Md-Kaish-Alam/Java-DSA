package SortingAlgorithms;
//https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositiveNumber {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};

        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swapping(nums, i, correct);
            } else {
                i++;
            }
        }

        // find the missing element
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        return nums.length + 1;
    }

    public static void swapping(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
