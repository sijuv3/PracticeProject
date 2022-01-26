package list;

/*
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {
    public static void main(String[] args) {

    }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null)
                return false;

            ListNode slow = head;
            ListNode fast = head.next;

            while (slow != fast) {
                if (fast == null || fast.next == null)
                    return false;       // reached the end, and never came back around for cycle.

                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
        }
    }
}
