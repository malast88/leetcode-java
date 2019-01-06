package malast88.leetcode.problems.convertsortedarraytobinarysearchtree;

public class ConvertSortedArrayToBinarySearchTree {

    /**
     * Solution for https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
     * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
     * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
     * Example:
     * Given the sorted array: [-10,-3,0,5,9],
     * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
     *       0
     *      / \
     *    -3   9
     *    /   /
     *  -10  5
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return getBst(nums, 0, nums.length - 1);
    }

    private TreeNode getBst(int[] nums, int from, int to) {
        if (from > to) {
            return null;
        }
        int rootPosition = (from + to) / 2;
        TreeNode root = new TreeNode(nums[rootPosition]);
        root.left = getBst(nums, from, rootPosition - 1);
        root.right = getBst(nums, rootPosition + 1, to);
        return root;
    }
}
