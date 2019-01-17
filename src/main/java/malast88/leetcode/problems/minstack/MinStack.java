package malast88.leetcode.problems.minstack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Solution for https://leetcode.com/problems/min-stack/
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 */
public class MinStack {

    private Deque<Integer> values;
    private Deque<Integer> minValues;

    public MinStack() {
        values = new ArrayDeque<>();
        minValues = new ArrayDeque<>();
    }

    public void push(int x) {
        int minValue = x;
        if (!minValues.isEmpty() && minValue > minValues.peek()) {
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
