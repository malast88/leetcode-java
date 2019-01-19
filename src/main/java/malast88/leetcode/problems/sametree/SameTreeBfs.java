package malast88.leetcode.problems.sametree;

import java.util.ArrayDeque;

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
        ArrayDequeQueue<TreeNode> pQ = new ArrayDequeQueue<>();
        ArrayDequeQueue<TreeNode> qQ = new ArrayDequeQueue<>();
        if (pQ.tryEnqueue(p) ^ qQ.tryEnqueue(q)) {
            return false;
        }
        while (!pQ.isEmpty()) {
            TreeNode pCurr = pQ.dequeue();
            TreeNode qCurr = qQ.dequeue();
            if (pCurr.val != qCurr.val
                    || pQ.tryEnqueue(pCurr.left) ^ qQ.tryEnqueue(qCurr.left)
                    || pQ.tryEnqueue(pCurr.right) ^ qQ.tryEnqueue(qCurr.right)) {
                return false;
            }
        }
        return true;
    }

    private class ArrayDequeQueue<T> {
        private ArrayDeque<T> data = new ArrayDeque<>();

        public boolean tryEnqueue(T item) {
            if (item == null) {
                return false;
            }
            data.addLast(item);
            return true;
        }

        public T dequeue() {
            return data.removeFirst();
        }

        public boolean isEmpty() {
            return data.isEmpty();
        }
    }
}
