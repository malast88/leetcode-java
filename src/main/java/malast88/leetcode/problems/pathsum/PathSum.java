package malast88.leetcode.problems.pathsum;

public class PathSum {

    /**
     * Solution for https://leetcode.com/problems/path-sum/
     * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        return hasPathSum(root, sum, 0);
    }

    private boolean hasPathSum(TreeNode root, int targetSum, int currentSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return currentSum + root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum, currentSum + root.val)
                || hasPathSum(root.right, targetSum, currentSum + root.val);

    }
}
