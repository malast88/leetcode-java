package malast88.leetcode.problems.singlenumber;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberSet {

    /**
     * Solution for https://leetcode.com/problems/single-number/
     * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
     * Note:
     * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }
}
