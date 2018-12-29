package malast88.leetcode.problems.addbinary;

public class AddBinary {
    public String addBinary(String a, String b) {
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int overflow = 0;
        StringBuilder result = new StringBuilder("");
        while (aIndex >= 0 || bIndex >= 0 || overflow > 0) {
            int aCurrDigit = getDigit(a, aIndex);
            int bCurrDigit = getDigit(b, bIndex);
            int currSum = aCurrDigit + bCurrDigit + overflow;
            if (currSum >= 2) {
                currSum -= 2;
                overflow = 1;
            } else {
                overflow = 0;
            }
            result.insert(0, currSum % 2 == 0 ? "0" : "1");
            aIndex--;
            bIndex--;
        }
        return result.toString();
    }

    private int getDigit(String a, int aIndex) {
        if (aIndex < 0) {
            return 0;
        }
        if (a.charAt(aIndex) == '1') {
            return 1;
        } else {
            return 0;
        }
    }
}
