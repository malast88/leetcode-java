package malast88.leetcode.problems.searchinsertposition;

public class SearchInsertPosition {

    /**
     * Solution for https://leetcode.com/problems/search-insert-position/
     * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     * You may assume no duplicates in the array.
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        for (int numsIndex = 0; numsIndex < nums.length; numsIndex++) {
            if (nums[numsIndex] >= target) {
                return numsIndex;
            }
        }
        return nums.length;
    }
}
