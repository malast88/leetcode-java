package malast88.leetcode.problems.singlenumber;

public class SingleNumberXor {

    /**
     * Solution for https://leetcode.com/problems/single-number/
     * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
     * Note:
     * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num: nums) {
            result ^= num;
        }
        return result;
    }
}
