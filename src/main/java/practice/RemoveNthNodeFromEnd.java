package practice;

public class RemoveNthNodeFromEnd {

    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        start.next = head;

        for (int i=1; i<=n+1; i++) {
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        while (fast.next != null) {
            fast = fast.next;
            if (n-- <= 0) {
                slow = slow.next;
            }
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
