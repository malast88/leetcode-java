package malast88.leetcode.problems.removeduplicatesfromsortedlist;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class RemoveDuplicatesFromSortedListTest {

    @InjectMocks
    private RemoveDuplicatesFromSortedList sut;

    private static Stream<Arguments> getDeleteDuplicatesArgs() {
        return Stream.of(
                Arguments.of(
                        getListFromIntArray(1, 1, 2),
                        getListFromIntArray(1, 2)),
                Arguments.of(
                        getListFromIntArray(1, 1, 2, 3, 3),
                        getListFromIntArray(1, 2, 3)),
                Arguments.of(
                        getListFromIntArray(),
                        getListFromIntArray())
        );
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
    @MethodSource("getDeleteDuplicatesArgs")
    public void itShouldDeleteDuplicates(ListNode head, ListNode expectedResult) {
        // init

        // test
        ListNode result = sut.deleteDuplicates(head);

        // verify
        while (expectedResult != null) {
            assertNotNull(result);
            assertEquals(expectedResult.val, result.val);
            expectedResult = expectedResult.next;
            result = result.next;
        }
        assertNull(result);
    }
}
