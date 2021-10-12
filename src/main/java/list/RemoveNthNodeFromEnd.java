package list;

import java.util.ArrayList;

public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {
        RemoveNthNodeFromEnd r = new RemoveNthNodeFromEnd();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        r.printVal(r.removeNthFromEnd1(n1, 2));
        //r.printVal(r.removeNthFromEnd2(n1, 2));

    }

    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start;
        ListNode fast = start;
        start.next = head;

        for (int i=1; i<=n+1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
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

    private void printVal(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode dummy = head;
        while(dummy!= null) {
            arr.add(dummy.val);
            dummy = dummy.next;
        }
        System.out.println(arr.toString());
    }
}
