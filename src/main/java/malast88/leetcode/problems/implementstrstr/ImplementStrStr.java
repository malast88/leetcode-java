package malast88.leetcode.problems.implementstrstr;

public class ImplementStrStr {

    /**
     * Solution for https://leetcode.com/problems/implement-strstr/
     * Implement strStr().
     * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        for (int hIndex = 0; hIndex < haystack.length(); hIndex++) {
            if (haystack.charAt(hIndex) == needle.charAt(0)) {
                if (checkSubstring(haystack, needle, hIndex)) {
                    return hIndex;
                }
            }
        }
        return -1;
    }

    private boolean checkSubstring(String haystack, String needle, int hIndex) {
        for (int nIndex = 0; nIndex < needle.length(); nIndex++) {
            if ((hIndex + nIndex) >= haystack.length()) {
                return false;
            }
            if (haystack.charAt(hIndex + nIndex) != needle.charAt(nIndex)) {
                return false;
            }
        }
        return true;
    }
}
