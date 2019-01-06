package malast88.leetcode.problems.symmetrictree;

public class SymmetricTreeRecursion {

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
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null || a.val != b.val) {
            return false;
        }
        return isSymmetric(a.left, b.right) && isSymmetric(a.right, b.left);
    }
}
