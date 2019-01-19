package malast88.leetcode.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayDequeStackTest {
    @Test
    public void itShouldImplementItsContract() {
        ArrayDequeStack<Integer> sut = new ArrayDequeStack<>();
        assertTrue(sut.isEmpty());
        assertTrue(sut.tryPush(5));
        assertFalse(sut.isEmpty());
        assertFalse(sut.tryPush(null));
        assertEquals((Integer)5, sut.pop());
        assertTrue(sut.isEmpty());
    }
}
