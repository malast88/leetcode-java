package malast88.leetcode.problems.longestcommonprefix;

public class LongestCommonPrefix {

    /**
     * Solution for https://leetcode.com/problems/longest-common-prefix
     * Write a function to find the longest common prefix string amongst an array of strings.
     * If there is no common prefix, return an empty string "".
     * @param strs Array of strings to find the longets common prefix
     * @return Longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int currentIndex = 0;
        while (currentIndex < strs[0].length()) {
            int currentChar = strs[0].charAt(currentIndex);
            for (int i=1;i<strs.length;i++) {
                if (currentIndex == strs[i].length() || strs[i].charAt(currentIndex) != currentChar) {
                    return strs[0].substring(0, currentIndex);
                }
            }
            currentIndex++;
        }
        return strs[0];
    }
}
