package SortingAlgorithms;

//https://leetcode.com/problems/find-the-duplicate-number/
// Google Asked question

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicates(nums));
    }

    public static int findDuplicates(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swapping (nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    public static void swapping(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[first] = temp;
    }
}
