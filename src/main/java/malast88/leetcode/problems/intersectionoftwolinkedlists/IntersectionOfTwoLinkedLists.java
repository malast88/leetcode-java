package malast88.leetcode.problems.intersectionoftwolinkedlists;

public class IntersectionOfTwoLinkedLists {

    /**
     * Solution for https://leetcode.com/problems/intersection-of-two-linked-lists/
     * Write a program to find the node at which the intersection of two singly linked lists begins.
     * Notes:
     * If the two linked lists have no intersection at all, return null.
     * The linked lists must retain their original structure after the function returns.
     * You may assume there are no cycles anywhere in the entire linked structure.
     * Your code should preferably run in O(n) time and use only O(1) memory.
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getListLength(headA);
        int lengthB = getListLength(headB);
        if (lengthA > lengthB) {
            headA = skipList(headA, lengthA - lengthB);
        } else if (lengthB > lengthA) {
            headB = skipList(headB, lengthB - lengthA);
        }
        // actually cycle will do until headA == headB or both are equal to null (i.e. no intersection)
        // so that no additional null check here
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private ListNode skipList(ListNode head, int skip) {
        for (int i=0;i<skip;i++) {
            head = head.next;
        }
        return head;
    }

    private int getListLength(ListNode head) {
        int result = 0;
        while (head != null) {
            head = head.next;
            result++;
        }
        return result;
    }
}
