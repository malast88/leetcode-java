package malast88.leetcode.problems.lengthoflastword;

public class LengthOfLastWord {

    /**
     * Solution for https://leetcode.com/problems/length-of-last-word/
     * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
     * If the last word does not exist, return 0.
     *
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        int lenLastWord = 0;
        int sIndex = 0;
        while (sIndex < s.length()) {
            if (s.charAt(sIndex) != ' ') {
                int lenCurrWord = getWordLength(s, sIndex);
                lenLastWord = lenCurrWord;
                sIndex += lenCurrWord;
            } else {
                sIndex += getSpaceLength(s, sIndex);
            }
        }
        return lenLastWord;
    }

    private int getWordLength(String s, int sIndex) {
        int result = 0;
        while (sIndex < s.length() && s.charAt(sIndex) != ' ') {
            result++;
            sIndex++;
        }
        return result;
    }

    private int getSpaceLength(String s, int sIndex) {
        int result = 0;
        while (sIndex < s.length() && s.charAt(sIndex) == ' ') {
            result++;
            sIndex++;
        }
        return result;
    }
}
