package malast88.leetcode.problems.pascalstriangleii;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleii {

    /**
     * Solution for https://leetcode.com/problems/pascals-triangle-ii/
     * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
     * Note that the row index starts from 0.
     * Follow up:
     * Could you optimize your algorithm to use only O(k) extra space?
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        int[] result = new int[rowIndex+1];
        result[0] = 1;
        for (int i=1;i<=rowIndex;i++) {
            makeNextRow(result, i);
        }
        List<Integer> resultList = new ArrayList<>(rowIndex+1);
        for (int i=0;i<=rowIndex;i++) {
            resultList.add(result[i]);
        }
        return resultList;
    }

    private void makeNextRow(int[] prevRow, int index) {
        int[] result = prevRow;
        result[index] = prevRow[index-1];
        for (int i=index-1;i>=1;i--) {
            result[i] = prevRow[i-1] + prevRow[i];
        }
        result[0] = prevRow[0];
    }
}
