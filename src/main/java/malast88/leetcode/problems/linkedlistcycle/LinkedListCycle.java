package malast88.leetcode.problems.linkedlistcycle;

public class LinkedListCycle {

    /**
     * Solution for https://leetcode.com/problems/linked-list-cycle/
     * Given a linked list, determine if it has a cycle in it.
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slowRunner = head;
        ListNode fastRunner = head.next;
        while (slowRunner != fastRunner) {
            slowRunner = slowRunner.next;
            if (fastRunner == null) {
                return false;
            }
            fastRunner = fastRunner.next;
            if (fastRunner == null) {
                return false;
            }
            fastRunner = fastRunner.next;
        }
        return true;
    }
}
