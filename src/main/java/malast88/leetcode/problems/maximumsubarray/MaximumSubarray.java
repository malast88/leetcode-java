package malast88.leetcode.problems.maximumsubarray;

public class MaximumSubarray {

    /**
     * Solution for https://leetcode.com/problems/maximum-subarray/
     * <p>
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sumMaxUpToCurrent = nums[0];
        int sumMax = nums[0];
        for (int numsIndex = 1; numsIndex < nums.length; numsIndex++) {
            sumMaxUpToCurrent = max(nums[numsIndex], sumMaxUpToCurrent + nums[numsIndex]);
            sumMax = max(sumMax, sumMaxUpToCurrent);
        }
        return sumMax;
    }

    private int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
