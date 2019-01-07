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
        return isBalancedTree(root).isBalanced;
    }

    private BalancedResult isBalancedTree(TreeNode root) {
        if (root == null) {
            return new BalancedResult(true, 0);
        }
        BalancedResult leftResult = isBalancedTree(root.left);
        BalancedResult rightResult = isBalancedTree(root.right);
        int subtreeDiff = Math.abs(leftResult.depth - rightResult.depth);
        int maxDepth = Math.max(leftResult.depth, rightResult.depth);
        return new BalancedResult(leftResult.isBalanced && rightResult.isBalanced && subtreeDiff <= 1,
                maxDepth + 1);
    }

    private class BalancedResult {
        public boolean isBalanced;
        public int depth;
        public BalancedResult(boolean isBalanced, int depth) {
            this.isBalanced = isBalanced;
            this.depth = depth;
        }
    }
}
