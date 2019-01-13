package malast88.leetcode.problems.linkedlistcycle;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LinkedListCycleTest {

    @InjectMocks
    private LinkedListCycle sut;

    private static Stream<Arguments> getHasCycleArgs() {
        return Stream.of(
                Arguments.of(getCycledList(getListFromIntArray(), -1), false),
                Arguments.of(getCycledList(getListFromIntArray(1), 0), true),
                Arguments.of(getCycledList(getListFromIntArray(1, 2, 3, 4), 1), true),
                Arguments.of(getCycledList(getListFromIntArray(1, 2, 3, 4), -1), false),
                Arguments.of(getCycledList(getListFromIntArray(1, 2, 3, 4, 5), -1), false)
        );
    }

    private static ListNode getCycledList(ListNode head, int cyclePos) {
        if (cyclePos == -1) {
            return head;
        }
        int currentNodePos = 0;
        ListNode currentNode = head;
        ListNode cycleNode = head;
        while (currentNode.next != null) {
            if (currentNodePos == cyclePos) {
                cycleNode = currentNode;
            }
            currentNode = currentNode.next;
            currentNodePos++;
        }
        currentNode.next = cycleNode;
        return head;
    }

    private static ListNode getListFromIntArray(int... data) {
        ListNode result = null;
        ListNode resultCurr = null;
        for (int i = 0; i < data.length; i++) {
            ListNode newNode = new ListNode(data[i]);
            if (result == null) {
                result = newNode;
                resultCurr = newNode;
            } else {
                resultCurr.next = newNode;
                resultCurr = newNode;
            }
        }
        return result;
    }

    @ParameterizedTest
    @MethodSource("getHasCycleArgs")
    public void itShouldAnswerIfHasCycle(ListNode head, boolean expectedResult) {
        // init

        // test
        boolean result = sut.hasCycle(head);

        // verify
        assertEquals(expectedResult, result);
    }
}
