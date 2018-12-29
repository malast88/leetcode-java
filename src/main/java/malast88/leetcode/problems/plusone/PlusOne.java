package malast88.leetcode.problems.plusone;

public class PlusOne {

    /**
     * Solution for https://leetcode.com/problems/plus-one/
     * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
     * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
     * You may assume the integer does not contain any leading zero, except the number 0 itself.
     *
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        if (arrayIsAllNines(digits)) {
            return powerTen(digits.length);
        } else {
            return addOneToArrayWithoutOverflow(digits);
        }
    }

    private boolean arrayIsAllNines(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                return false;
            }
        }
        return true;
    }

    private int[] powerTen(int power) {
        int[] result = new int[power + 1];
        result[0] = 1;
        for (int i = 1; i < power + 1; i++) {
            result[i] = 0;
        }
        return result;
    }

    private int[] addOneToArrayWithoutOverflow(int[] digits) {
        int digitsIndex = digits.length - 1;
        while (digitsIndex > -1) {
            if (digits[digitsIndex] == 9) {
                digits[digitsIndex] = 0;
                digitsIndex--;
            } else {
                digits[digitsIndex] = digits[digitsIndex] + 1;
                digitsIndex = -1;
            }
        }
        return digits;
    }
}
