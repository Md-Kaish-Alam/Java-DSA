package BinarySearch;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i] && j != i) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
