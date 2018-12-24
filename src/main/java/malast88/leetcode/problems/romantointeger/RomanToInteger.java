package malast88.leetcode.problems.romantointeger;

public class RomanToInteger {

    /**
     * Solution for https://leetcode.com/problems/roman-to-integer
     * Given a roman numeral, convert it to an integer.
     * @param s String representing roman number
     * @return Result of conversion
     */
    public int romanToInt(String s) {
        // no validation -assuming the input numbers are correct
        int result = 0;
        int prevValue = 0;
        for (int i=s.length()-1;i>=0;i--) {
            Character currChar = s.charAt(i);
            int currValue = 0;
            switch (currChar) {
                case 'I': currValue = 1; break;
                case 'V': currValue = 5; break;
                case 'X': currValue = 10; break;
                case 'L': currValue = 50; break;
                case 'C': currValue = 100; break;
                case 'D': currValue = 500; break;
                case 'M': currValue = 1000; break;
                default: currValue = 0;
            }
            // processing the string from right to left, if the current position is less then the previous one
            // than need to subtract, like this:
            // IX
            // ^
            //
            // other cases need add
            if (prevValue > currValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }
        return result;
    }
}
