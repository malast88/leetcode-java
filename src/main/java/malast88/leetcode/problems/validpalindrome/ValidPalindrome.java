package malast88.leetcode.problems.validpalindrome;

public class ValidPalindrome {

    /**
     * Solution for https://leetcode.com/problems/valid-palindrome/
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     * Note: For the purpose of this problem, we define empty string as valid palindrome.
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        int bIdx = 0;
        int eIdx = s.length() - 1;
        while (bIdx < eIdx) {
            if (!isValidCharacterForComparisonAt(s, bIdx)) {
                bIdx++;
            } else if (!isValidCharacterForComparisonAt(s, eIdx)) {
                eIdx--;
            } else {
                char bChar = getValidCharacterForComparisonAt(s, bIdx);
                char eChar = getValidCharacterForComparisonAt(s, eIdx);
                if (bChar != eChar) {
                    return false;
                }
                bIdx++;
                eIdx--;
            }
        }
        return true;
    }

    private boolean isValidCharacterForComparisonAt(String s, int index) {
        char chr = s.charAt(index);
        return Character.isLetterOrDigit(chr);
    }

    private char getValidCharacterForComparisonAt(String s, int index) {
        char chr = s.charAt(index);
        if (Character.isDigit(chr) || Character.isLowerCase(chr)) {
            return chr;
        }
        return Character.toLowerCase(chr);
    }
}
