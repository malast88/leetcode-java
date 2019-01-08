package malast88.leetcode.problems.pascalstriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

    /**
     * Solution for https://leetcode.com/problems/pascals-triangle/
     * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        result.add(Arrays.asList(1));
        for (int i=2;i<=numRows;i++) {
            result.add(generate(result.get(i-2), i));
        }
        return result;
    }

    private List<Integer> generate(List<Integer> prev, int n) {
        List<Integer> result = new ArrayList<>();
        result.add(prev.get(0));
        for (int i=1;i<=n-2;i++) {
            result.add(prev.get(i-1) + prev.get(i));
        }
        result.add(prev.get(n-2));
        return result;
    }
}
