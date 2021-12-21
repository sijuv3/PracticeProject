package list;

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        MiddleOfLinkedList m = new MiddleOfLinkedList();
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
        System.out.println(m.solution(n1).val);
    }

     private ListNode solution(ListNode head) {
         ListNode a_pointer = head;
         ListNode b_pointer = head;

         while (b_pointer != null && b_pointer.next != null) {
             a_pointer = a_pointer.next;
             b_pointer = b_pointer.next.next;
         }

         return a_pointer;
     }
}
