package practice;

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        MiddleOfLinkedList m = new MiddleOfLinkedList();

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
