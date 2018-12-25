package malast88.leetcode.problems.removeduplicatesfromsortedarray;

public class RemoveDuplicatesFromSortedArrayTwoRunners {

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
        int firstRunner = 0;
        for (int secondRunner = 1; secondRunner < nums.length; secondRunner++) {
            if (nums[secondRunner] != nums[firstRunner]) {
                nums[firstRunner + 1] = nums[secondRunner];
                firstRunner++;
            } else {
                len--;
            }
        }
        return len;
    }
}
