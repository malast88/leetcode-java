package malast88.leetcode.problems.palindromenumber;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {

    /**
     * Solution for https://leetcode.com/problems/palindrome-number
     * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
     * Follow up:     *
     * Coud you solve it without converting the integer to a string?
     * @param x - number to determine if it is palindrome
     * @return result
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        List<Integer> digits = new ArrayList<>(16);
        while (x > 0) {
            digits.add(x%10);
            x /= 10;
        }
        for (int i=0;i<digits.size()/2;i++) {
            if (digits.get(i) != digits.get(digits.size()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
