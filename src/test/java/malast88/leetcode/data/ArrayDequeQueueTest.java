package malast88.leetcode.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayDequeQueueTest {
    @Test
    public void itShouldImplementItsContract() {
        ArrayDequeQueue<Integer> sut = new ArrayDequeQueue<>();
        assertTrue(sut.isEmpty());
        assertTrue(sut.tryEnqueue(5));
        assertFalse(sut.isEmpty());
        assertFalse(sut.tryEnqueue(null));
        assertEquals((Integer)5, sut.dequeue());
        assertTrue(sut.isEmpty());
    }
}
