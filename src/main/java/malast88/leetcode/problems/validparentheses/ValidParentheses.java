package malast88.leetcode.problems.validparentheses;

import java.util.Stack;

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
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar == '(' || currChar == '[' || currChar == '{') {
                stack.push(currChar);
            }
            if (currChar == ')' || currChar == ']' || currChar == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char prevChar = stack.pop();
                if (prevChar == '(' && currChar != ')'
                        || prevChar == '[' && currChar != ']'
                        || prevChar == '{' && currChar != '}') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
