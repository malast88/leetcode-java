package malast88.leetcode.problems.climbingstairs;

public class ClimbingStairs {

    /**
     * Solution for https://leetcode.com/problems/climbing-stairs/
     * You are climbing a stair case. It takes n steps to reach to the top.
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     * Note: Given n will be a positive integer.
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int resultAtMinus2 = 1;
        int resultAtMinus1 = 2;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = resultAtMinus1 + resultAtMinus2;
            resultAtMinus2 = resultAtMinus1;
            resultAtMinus1 = result;
        }
        return result;
    }
}
