package malast88.leetcode.problems.sametree;

public class SameTreeRecursion {

    /**
     * Solution for https://leetcode.com/problems/same-tree/
     * Given two binary trees, write a function to check if they are the same or not.
     * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null || p.val != q.val) {
            return false;
        } else return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}