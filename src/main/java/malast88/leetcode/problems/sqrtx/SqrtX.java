package malast88.leetcode.problems.sqrtx;

public class SqrtX {

    /**
     * Solution for https://leetcode.com/problems/sqrtx/
     * Implement int sqrt(int x).
     * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
     * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        int min = 0;
        int max = x / 2;
        int result = 0;
        if (max > 46340) {
            max = 46340;
        }
        while (min <= max) {
            int mid = (min + max) / 2;
            int sqr = mid * mid;
            if (sqr == x) {
                return mid;
            } else if (sqr > x) {
                max = mid - 1;
            } else {
                min = mid + 1;
                result = mid;
            }
        }
        return result;
    }
}
