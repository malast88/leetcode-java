package malast88.leetcode.problems.mergetwosortedlists;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class MergeTwoSortedListsTest {

    @InjectMocks
    private MergeTwoSortedLists sut;

    private static Stream<Arguments> getMergeTwoListsArgs() {
        return Stream.of(
                Arguments.of(
                        getListFromIntArray(1, 2, 4),
                        getListFromIntArray(1, 3, 4),
                        getListFromIntArray(1, 1, 2, 3, 4, 4)),
                Arguments.of(
                        getListFromIntArray(),
                        getListFromIntArray(),
                        getListFromIntArray()),
                Arguments.of(
                        getListFromIntArray(),
                        getListFromIntArray(1, 2, 3),
                        getListFromIntArray(1, 2, 3)),
                Arguments.of(
                        getListFromIntArray(1, 5, 10),
                        getListFromIntArray(2, 3),
                        getListFromIntArray(1, 2, 3, 5, 10))
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
    @MethodSource("getMergeTwoListsArgs")
    public void itShouldMergeTwoLists(ListNode l1, ListNode l2, ListNode expectedResult) {
        // init

        // test
        ListNode result = sut.mergeTwoLists(l1, l2);

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
