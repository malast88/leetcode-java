package malast88.leetcode.problems.mergetwosortedlists;

public class MergeTwoSortedLists {

    /**
     * Solution for https://leetcode.com/problems/merge-two-sorted-lists/
     * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     *
     * @param l1 First list
     * @param l2 Second list
     * @return Merged list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode resulltCurr = null;
        while (l1 != null || l2 != null) {
            ListNode nextNode;

            if (l1 == null) {
                nextNode = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                nextNode = l1;
                l1 = l1.next;
            } else {
                if (l1.val < l2.val) {
                    nextNode = l1;
                    l1 = l1.next;
                } else {
                    nextNode = l2;
                    l2 = l2.next;
                }
            }

            if (result == null) {
                result = nextNode;
                resulltCurr = result;
            } else {
                resulltCurr.next = nextNode;
                resulltCurr = nextNode;
            }
        }
        return result;
    }
}
