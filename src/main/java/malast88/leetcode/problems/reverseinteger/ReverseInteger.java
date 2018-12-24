package malast88.leetcode.problems.reverseinteger;

public class ReverseInteger {

    /**
     * Solution for https://leetcode.com/problems/reverse-integer
     * Given a 32-bit signed integer, reverse digits of an integer.
     * Note:
     * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
     * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
     * @param x integer to reverse digits
     * @return integer with the reversed digits
     */
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int currDigit = x % 10;
            try {
                result = Math.addExact(Math.multiplyExact(result,10), currDigit);
            } catch (ArithmeticException ex) {
                return 0;
            }
            x = x / 10;
        }
        return result;
    }
}
