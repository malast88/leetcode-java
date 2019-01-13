package malast88.leetcode.problems.intersectionoftwolinkedlists;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class IntersectionOfTwoLinkedListsTest {

    @InjectMocks
    private IntersectionOfTwoLinkedLists sut;

    private static Stream<Arguments> getGetIntersectionNodeArgs() {
        Stream.Builder<Arguments> builder = Stream.builder();
        ListNode a = getListFromIntArray(4, 1, 8, 4, 5);
        ListNode b = getListFromIntArray(5, 0, 1, 8, 4, 5);
        builder.add(Arguments.of(a, b, makeListsIntersection(a, 2, b, 3)));
        a = getListFromIntArray(3, 2, 4);
        b = getListFromIntArray(0, 9, 1);
        builder.add(Arguments.of(a, b, makeListsIntersection(a, 1, b, 1)));
        a = getListFromIntArray(2, 6, 4);
        b = getListFromIntArray(31, 5);
        builder.add(Arguments.of(a, b, makeListsIntersection(a, 3, b, 2)));
        a = getListFromIntArray(2, 6, 4);
        b = null;
        builder.add(Arguments.of(a, b, makeListsIntersection(a, 3, b, 0)));
        return builder.build();
    }

    private static ListNode makeListsIntersection(ListNode a, int skipA, ListNode b, int skipB) {
        ListNode aPrev = null;
        ListNode bPrev = null;
        for (int i = 0; i < skipA; i++) {
            aPrev = a;
            a = a.next;
        }
        for (int i = 0; i < skipB; i++) {
            bPrev = b;
            b = b.next;
        }
        ListNode intersectionStart = null;
        if (a != null) {
            intersectionStart = a;
        } else if (b != null) {
            intersectionStart = b;
        }
        if (aPrev != null) {
            aPrev.next = intersectionStart;
        }
        if (bPrev != null) {
            bPrev.next = intersectionStart;
        }
        return intersectionStart;
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
    @MethodSource("getGetIntersectionNodeArgs")
    public void itShouldGetIntersectionNode(ListNode headA, ListNode headB, ListNode expectedResult) {
        // init

        // test
        ListNode result = sut.getIntersectionNode(headA, headB);

        // verify
        assertEquals(expectedResult, result);
    }
}
