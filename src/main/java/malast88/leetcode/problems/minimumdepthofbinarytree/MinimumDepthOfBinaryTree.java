package malast88.leetcode.problems.minimumdepthofbinarytree;

public class MinimumDepthOfBinaryTree {

    /**
     * Solution for https://leetcode.com/problems/minimum-depth-of-binary-tree/
     * Given a binary tree, find its minimum depth.
     * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
     * Note: A leaf is a node with no children.
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null) {
            return minDepth(root.right)+1;
        } else if (root.right == null) {
            return minDepth(root.left)+1;
        } else {
            return Math.min(minDepth(root.right)+1, minDepth(root.left)+1);
        }
    }
}
