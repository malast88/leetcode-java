package malast88.leetcode.problems.balancedbinarytree;

public class BalancedBinaryTree {

    /**
     * Solution for https://leetcode.com/problems/balanced-binary-tree/
     * Given a binary tree, determine if it is height-balanced.
     * For this problem, a height-balanced binary tree is defined as:
     * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        return isBalancedTree(root) >= 0;
    }

    private int isBalancedTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftResult = isBalancedTree(root.left);
        int rightResult = isBalancedTree(root.right);
        int subtreeDiff = Math.abs(leftResult - rightResult);
        if (leftResult < 0 || rightResult < 0 || subtreeDiff > 1) {
            return -1;
        }
        return Math.max(leftResult, rightResult) + 1;
    }
}
