package malast88.leetcode.problems.majorityelement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /**
     * Solution for https://leetcode.com/problems/majority-element/
     * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
     * You may assume that the array is non-empty and the majority element always exist in the array.
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num: nums) {
            if (!numsMap.containsKey(num)) {
                numsMap.put(num, 1);
            } else {
                numsMap.put(num, numsMap.get(num)+1);
            }
        }
        int result = 0;
        int maxEntires = 0;
        for (Map.Entry<Integer, Integer> num: numsMap.entrySet()) {
            if (num.getValue() > maxEntires) {
                result = num.getKey();
                maxEntires = num.getValue();
            }
        }
        return result;
    }
}
