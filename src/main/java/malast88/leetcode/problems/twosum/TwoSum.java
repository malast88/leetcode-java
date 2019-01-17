package malast88.leetcode.problems.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Solution for https://leetcode.com/problems/two-sum/
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * @param nums array of numbers
     * @param target target sum
     * @return array length of 2 with indexes of the elements of the sum
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbersToIndicies = new HashMap<>(nums.length);
        for (int i=0;i<nums.length;i++) {
            int rest = target - nums[i];
            if (numbersToIndicies.containsKey(rest)) {
                int[] result = new int[2];
                result[0] = numbersToIndicies.get(rest);
                result[1] = i;
                return result;
            }
            numbersToIndicies.put(nums[i], i);
        }
        return new int[0];
    }
}
