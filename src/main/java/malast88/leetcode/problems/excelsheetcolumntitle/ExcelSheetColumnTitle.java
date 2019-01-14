package malast88.leetcode.problems.excelsheetcolumntitle;

public class ExcelSheetColumnTitle {

    /**
     * Solution for https://leetcode.com/problems/excel-sheet-column-title/
     * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
     * @param n
     * @return
     */
    public String convertToTitle(int n) {
        String result = "";
        while (n > 0) {
            result = (char)((int)'A' + (n-1)%26) + result;
            n = (n-1)/26;
        }
        return result;
    }
}
