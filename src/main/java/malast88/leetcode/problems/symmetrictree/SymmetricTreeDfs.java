package malast88.leetcode.problems.symmetrictree;

import java.util.ArrayDeque;

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
        ArrayDequeStack<TreeNode> stackA = new ArrayDequeStack<>();
        ArrayDequeStack<TreeNode> stackB = new ArrayDequeStack<>();
        if (stackA.tryPush(root.left) ^ stackB.tryPush(root.right)) {
            return false;
        }
        while (!stackA.isEmpty()) {
            TreeNode a = stackA.pop();
            TreeNode b = stackB.pop();
            if (a.val != b.val
                    || stackA.tryPush(a.left) ^ stackB.tryPush(b.right)
                    || stackA.tryPush(a.right) ^ stackB.tryPush(b.left)) {
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
