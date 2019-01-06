package malast88.leetcode.problems.symmetrictree;

import java.util.Stack;

public class SymmetricTreeDfs {

    /**
     * Solution for https://leetcode.com/problems/symmetric-tree/
     * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stackA = new Stack<>();
        Stack<TreeNode> stackB = new Stack<>();
        stackA.push(root.left);
        stackB.push(root.right);
        while (!stackA.isEmpty() && !stackB.isEmpty()) {
            TreeNode a = stackA.pop();
            TreeNode b = stackB.pop();
            if (a == null && b == null) {
                continue;
            }
            if (a == null || b == null || a.val != b.val) {
                return false;
            }
            stackA.push(a.left);
            stackB.push(b.right);
            stackA.push(a.right);
            stackB.push(b.left);
        }
        return stackA.size() == stackB.size();
    }
}
