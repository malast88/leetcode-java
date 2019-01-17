package malast88.leetcode.problems.sametree;

import java.util.ArrayDeque;

public class SameTreeDfs {

    /**
     * Solution for https://leetcode.com/problems/same-tree/
     * Given two binary trees, write a function to check if they are the same or not.
     * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
     *
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayDequeStack<TreeNode> pQ = new ArrayDequeStack<>();
        ArrayDequeStack<TreeNode> qQ = new ArrayDequeStack<>();
        if (pQ.tryPush(p) ^ qQ.tryPush(q)) {
            return false;
        }
        while (!pQ.isEmpty()) {
            TreeNode pCurr = pQ.pop();
            TreeNode qCurr = qQ.pop();
            if (pCurr.val != qCurr.val
                    || pQ.tryPush(pCurr.left) ^ qQ.tryPush(qCurr.left)
                    || pQ.tryPush(pCurr.right) ^ qQ.tryPush(qCurr.right)) {
                return false;
            }
        }
        return true;
    }

    private class ArrayDequeStack<T> {
        private ArrayDeque<T> data = new ArrayDeque<>();

        public boolean tryPush(T item) {
            if (item == null) {
                return false;
            }
            data.push(item);
            return true;
        }

        public T pop() {
            return data.pop();
        }

        public boolean isEmpty() {
            return data.isEmpty();
        }
    }
}
