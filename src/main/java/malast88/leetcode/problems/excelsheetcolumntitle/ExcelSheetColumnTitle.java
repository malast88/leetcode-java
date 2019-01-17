package malast88.leetcode.problems.excelsheetcolumntitle;

public class ExcelSheetColumnTitle {

    /**
     * Solution for https://leetcode.com/problems/excel-sheet-column-title/
     * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
     * @param n
     * @return
     */
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder("");
        while (n > 0) {
            result.insert(0, (char)((int)'A' + (n-1)%26));
            n = (n-1)/26;
        }
        return result.toString();
    }
}
