package malast88.leetcode.problems.minstack;

import java.util.Stack;

/**
 * Solution for https://leetcode.com/problems/min-stack/
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 */
public class MinStack {

    private Stack<Integer> values;
    private Stack<Integer> minValues;

    public MinStack() {
        values = new Stack<>();
        minValues = new Stack<>();
    }

    public void push(int x) {
        int minValue = x;
        if (!minValues.empty() && minValue > minValues.peek()) {
            minValue = minValues.peek();
        }
        minValues.push(minValue);
        values.push(x);
    }

    public void pop() {
        values.pop();
        minValues.pop();
    }

    public int top() {
        return values.peek();
    }

    public int getMin() {
        return minValues.peek();
    }
}
