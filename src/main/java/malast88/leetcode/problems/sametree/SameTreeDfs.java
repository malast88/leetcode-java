package malast88.leetcode.problems.sametree;

import java.util.Stack;

public class SameTreeDfs {

    /**
     * Solution for https://leetcode.com/problems/same-tree/
     * Given two binary trees, write a function to check if they are the same or not.
     * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> pQ = new Stack<>();
        Stack<TreeNode> qQ = new Stack<>();
        pQ.push(p);
        qQ.push(q);
        while (!pQ.isEmpty() && !qQ.isEmpty()) {
            TreeNode pCurr = pQ.pop();
            TreeNode qCurr = qQ.pop();
            if (pCurr == null && qCurr == null) {
                continue;
            } else if (pCurr == null || qCurr == null || pCurr.val != qCurr.val) {
                return false;
            } else {
                pQ.push(pCurr.left);
                pQ.push(pCurr.right);
                qQ.push(qCurr.left);
                qQ.push(qCurr.right);
            }
        }
        return pQ.size() == qQ.size();
    }
}
