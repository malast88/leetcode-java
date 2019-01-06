package malast88.leetcode.problems.maximumdepthofbinarytree;

public class MaximumDepthOfBinaryTreeRecursion {

    /**
     * Solution for https://leetcode.com/problems/maximum-depth-of-binary-tree/
     * Given a binary tree, find its maximum depth.
     * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left)+1;
        int rightDepth = maxDepth(root.right)+1;
        if (leftDepth > rightDepth) {
            return leftDepth;
        } else {
            return rightDepth;
        }
    }
}
