package malast88.leetcode.problems.sametree;

import java.util.ArrayDeque;
import java.util.Deque;

public class SameTreeBfs {

    /**
     * Solution for https://leetcode.com/problems/same-tree/
     * Given two binary trees, write a function to check if they are the same or not.
     * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Deque<TreeNode> pQ = new ArrayDeque<>();
        Deque<TreeNode> qQ = new ArrayDeque<>();
        addNodeToDeque(pQ, p);
        addNodeToDeque(qQ, q);
        while (!pQ.isEmpty() && !qQ.isEmpty()) {
            TreeNode pCurr = pQ.removeFirst();
            TreeNode qCurr = qQ.removeFirst();
            if (pCurr.val != qCurr.val) {
                return false;
            }
            addNodeToDeque(pQ, pCurr.left);
            addNodeToDeque(qQ, qCurr.left);
            if (pQ.size() != qQ.size()) {
                return false;
            }
            addNodeToDeque(pQ, pCurr.right);
            addNodeToDeque(qQ, qCurr.right);
            if (pQ.size() != qQ.size()) {
                return false;
            }
        }
        return pQ.size() == qQ.size();
    }

    private void addNodeToDeque(Deque<TreeNode> deque, TreeNode node) {
        if (node != null) {
            deque.addLast(node);
        }
    }
}
