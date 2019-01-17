package malast88.leetcode.problems.validparentheses;

import java.util.ArrayDeque;
import java.util.HashMap;

public class ValidParentheses {

    /**
     * Solution for https://leetcode.com/problems/valid-parentheses/
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * An input string is valid if:
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     *
     * @param s String to determine if it is valid
     * @return Validness of the string
     */
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        HashMap<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('(', ')');
        parenthesesMap.put('[', ']');
        parenthesesMap.put('{', '}');
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (parenthesesMap.keySet().contains(currChar)) {
                stack.push(currChar);
            }
            if (parenthesesMap.containsValue(currChar)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char prevChar = stack.pop();
                if (!parenthesesMap.get(prevChar).equals(currChar)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
