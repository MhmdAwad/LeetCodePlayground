package problem_solving.easy;

import problem_solving.meduim.AddTwoNumbers.ListNode;

public class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode node = head;
        while (list1 != null || list2 != null) {
            int val1 = list1 != null ? list1.val : -1;
            int val2 = list2 != null ? list2.val : -1;
            if (list1 == null) {
                head.next = list2;
                break;
            } else if (list2 == null) {
                head.next = list1;
                break;
            }
            if (val1 < val2) {
                head.next = new ListNode(val1);
                list1 = list1.next;
            } else {
                head.next = new ListNode(val2);
                list2 = list2.next;
            }


            head = head.next;
        }

        return node.next;
    }
}
