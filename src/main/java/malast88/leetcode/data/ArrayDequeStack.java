package malast88.leetcode.data;

import java.util.ArrayDeque;

/**
 * Stack implementation. Wraps ArrayDeque. Null items are not allowed.
 * @param <T> Type of items stored in stack.
 */
public class ArrayDequeStack<T> {
    private ArrayDeque<T> data = new ArrayDeque<>();

    /**
     * Try to push item to the stack.
     * @param item Item to push
     * @return Was it possible to push item or not.
     */
    public boolean tryPush(T item) {
        if (item == null) {
            return false;
        }
        data.push(item);
        return true;
    }

    /**
     * Pop item from the stack.
     * @return Result of pop operation.
     */
    public T pop() {
        return data.pop();
    }

    /**
     * Determine if stack is empty.
     * @return Is stack empty or not.
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }
}
