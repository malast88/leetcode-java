package malast88.leetcode.problems.removeduplicatesfromsortedlist;

public class RemoveDuplicatesFromSortedList {

    /**
     * Solution for https://leetcode.com/problems/remove-duplicates-from-sorted-list/
     * Given a sorted linked list, delete all duplicates such that each element appear only once.
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            if (currNode.val == currNode.next.val) {
                currNode.next = currNode.next.next;
            } else {
                currNode = currNode.next;
            }
        }
        return head;
    }
}
