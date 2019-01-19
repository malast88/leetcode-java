package malast88.leetcode.problems.romantointeger;

import java.util.HashMap;
import java.util.Map;

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
        Map<Character, Integer> charToValueMap = new HashMap<>();
        charToValueMap.put('I', 1);
        charToValueMap.put('V', 5);
        charToValueMap.put('X', 10);
        charToValueMap.put('L', 50);
        charToValueMap.put('C', 100);
        charToValueMap.put('D', 500);
        charToValueMap.put('M', 1000);
        for (int i=s.length()-1;i>=0;i--) {
            Character currChar = s.charAt(i);
            int currValue = charToValueMap.get(currChar);
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
