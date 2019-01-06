package malast88.leetcode.problems.maximumdepthofbinarytree;

import java.util.Stack;

public class MaximumDepthOfBinaryTreeDfs {

    /**
     * Solution for https://leetcode.com/problems/maximum-depth-of-binary-tree/
     * Given a binary tree, find its maximum depth.
     * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        Stack<Integer> depthStack = new Stack<>();
        depthStack.push(1);
        int maxDepth = 0;
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            int currDepth = depthStack.pop();
            if (curr == null) {
                continue;
            }
            if (currDepth > maxDepth) {
                maxDepth = currDepth;
            }
            stack.push(curr.left);
            depthStack.push(currDepth+1);
            stack.push(curr.right);
            depthStack.push(currDepth+1);
        }
        return maxDepth;
    }
}
