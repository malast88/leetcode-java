package malast88.leetcode.problems.pathsum;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class PathSumTest {

    @InjectMocks
    private PathSum sut;

    private static Stream<Arguments> getHasPathSumArgs() {
        return Stream.of(
                Arguments.of(getTree(), 0, false),
                Arguments.of(getTree(), 1, false),
                Arguments.of(getTree(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1), 22, true),
                Arguments.of(getTree(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1), 23, false)
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

    @ParameterizedTest
    @MethodSource("getHasPathSumArgs")
    public void itShouldAnswerIfItHasPathSum(TreeNode root, int sum, boolean expectedResult) {
        // init

        // test
        boolean result = sut.hasPathSum(root, sum);

        // verify
        assertEquals(expectedResult, result);
    }
}
