package list;

/*
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeLists {
    public static void main(String[] args) {
        MergeLists m = new MergeLists();

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;

        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        ListNode mergedList = m.mergeTwoLists(n1, n2);
        System.out.println(mergedList.val);
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
