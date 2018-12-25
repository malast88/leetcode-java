package malast88.leetcode.problems.removeduplicatesfromsortedarray;

public class RemoveDuplicatesFromSortedArray {

    /**
     * Solution for https://leetcode.com/problems/remove-duplicates-from-sorted-array/
     * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     *
     * @param nums Array to remove duplicates from
     * @return New length of the array
     */
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i = 0;
        int nextElemShift = 1;
        while (i + nextElemShift < nums.length) {
            nums[i + 1] = nums[i + nextElemShift];
            if (nums[i] == nums[i + 1]) {
                nextElemShift += 1;
                len -= 1;
            } else {
                i++;
            }
        }
        return len;
    }
}
