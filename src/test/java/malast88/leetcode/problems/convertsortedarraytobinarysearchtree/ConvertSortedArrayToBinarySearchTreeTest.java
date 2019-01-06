package malast88.leetcode.problems.convertsortedarraytobinarysearchtree;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class ConvertSortedArrayToBinarySearchTreeTest {

    @InjectMocks
    private ConvertSortedArrayToBinarySearchTree sut;

    private static Stream<Arguments> getConvertSortedArrayToBSTrgs() {
        return Stream.of(
                Arguments.of(new int[]{}, getTree()),
                Arguments.of(new int[]{0}, getTree(0)),
                Arguments.of(new int[]{-10, -3, 0, 5, 9}, getTree(0, -10, 5, null, -3, null, 9)),
                Arguments.of(new int[]{0, 1, 2, 3, 4, 5}, getTree(2, 0, 4, null, 1, 3, 5))
        );
    }

    private static TreeNode getTree(Object... args) {
        if (args.length == 0 || args[0] == null) {
            return null;
        }
        TreeNode root = new TreeNode((int) args[0]);
        int currentTreeLevel = 1;
        List<TreeNode> prevTreeLevelNodes = new ArrayList<>();
        prevTreeLevelNodes.add(root);
        while (powTwo(currentTreeLevel) - 1 < args.length) {
            List<TreeNode> currentTreeLevelNodes = new ArrayList<>();
            for (int i = 0; i < prevTreeLevelNodes.size(); i++) {
                TreeNode prevTreeNode = prevTreeLevelNodes.get(i);
                if (prevTreeNode != null) {
                    int leftIndex = powTwo(currentTreeLevel) - 1 + i * 2;
                    if (leftIndex < args.length && args[leftIndex] != null) {
                        TreeNode left = new TreeNode((int) args[leftIndex]);
                        prevTreeNode.left = left;
                        currentTreeLevelNodes.add(left);
                    }
                    int rightIndex = powTwo(currentTreeLevel) - 1 + i * 2 + 1;
                    if (rightIndex < args.length && args[rightIndex] != null) {
                        TreeNode right = new TreeNode((int) args[rightIndex]);
                        prevTreeNode.right = right;
                        currentTreeLevelNodes.add(right);
                    }
                }
            }
            prevTreeLevelNodes = currentTreeLevelNodes;
            currentTreeLevel++;
        }
        return root;
    }

    private static int powTwo(int pow) {
        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result *= 2;
        }
        return result;
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null || p.val != q.val) {
            return false;
        } else return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    @ParameterizedTest
    @MethodSource("getConvertSortedArrayToBSTrgs")
    public void itShouldConvertSortedArrayToBST(int[] nums, TreeNode expectedResult) {
        // init

        // test
        TreeNode result = sut.sortedArrayToBST(nums);

        // verify
        assertTrue(isSameTree(expectedResult, result));
    }
}
