package malast88.leetcode.problems.binarytreelevelordertraversalii;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeLevelOrderTraversalii {

    /**
     * Solution for https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
     * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
     * For example:
     * Given binary tree [3,9,20,null,null,15,7],
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * return its bottom-up level order traversal as:
     * [
     *   [15,7],
     *   [9,20],
     *   [3]
     * ]
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<TreeNode> currLevel = new ArrayList<>();
        currLevel.add(root);
        Stack<List<Integer>> resultReversed = new Stack<>();
        while (currLevel.size() > 0) {
            List<TreeNode> nextLevel = new ArrayList<>();
            List<Integer> currentResult = new ArrayList<>();
            for (int i=0;i<currLevel.size();i++) {
                TreeNode currNode = currLevel.get(i);
                if (currNode != null) {
                    currentResult.add(currNode.val);
                    nextLevel.add(currNode.left);
                    nextLevel.add(currNode.right);
                }
            }
            if (currentResult.size() > 0) {
                resultReversed.push(currentResult);
            }
            currLevel = nextLevel;
        }
        List<List<Integer>> result = new ArrayList<>();
        while (!resultReversed.isEmpty()) {
            result.add(resultReversed.pop());
        }
        return result;
    }
}
