package malast88.leetcode.data;

import java.util.ArrayDeque;

/**
 * Queue implementation. Wraps ArrayDeque. Null items are not allowed.
 * @param <T> Type of items stored in queue.
 */
public class ArrayDequeQueue<T> {
    private ArrayDeque<T> data = new ArrayDeque<>();


    /**
     * Try to enqueue item to the queue.
     * @param item Item to enqueue
     * @return Was it possible to enqueue item or not.
     */
    public boolean tryEnqueue(T item) {
        if (item == null) {
            return false;
        }
        data.addLast(item);
        return true;
    }


    /**
     * Dequeue item from the queue.
     * @return Result of dequeue operation.
     */
    public T dequeue() {
        return data.removeFirst();
    }

    /**
     * Determine if queue is empty.
     * @return Is queue empty or not.
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }
}
