package malast88.leetcode.problems.maximumdepthofbinarytree;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumDepthOfBinaryTreeDfs {

    /**
     * Solution for https://leetcode.com/problems/maximum-depth-of-binary-tree/
     * Given a binary tree, find its maximum depth.
     * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        if (root != null) {
            stack.push(root);
        }
        Deque<Integer> depthStack = new ArrayDeque<>();
        depthStack.push(1);
        int maxDepth = 0;
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            int currDepth = depthStack.pop();
            if (currDepth > maxDepth) {
                maxDepth = currDepth;
            }
            if (curr.left != null) {
                stack.push(curr.left);
                depthStack.push(currDepth+1);
            }
            if (curr.right != null) {
                stack.push(curr.right);
                depthStack.push(currDepth+1);
            }
        }
        return maxDepth;
    }
}
