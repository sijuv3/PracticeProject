package list;

/*
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    /*
     * Input: head = [1,2,3,4,5]
     * Output: [5,4,3,2,1]
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }
        return prev;
    }
}
