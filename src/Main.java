import problem_solving.meduim.AddTwoNumbers.ListNode;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{7, 1, 5, 3, 6, 4};
        int[] nums1 = new int[]{1, 2, 3, 4, 5};
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode k = swapPairs(node);
        while (k != null) {
            System.out.println(">>>>>>>>>?? " + k.val);
            k = k.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode second = head.next;
        ListNode res = head.next;
        head.next = second.next;
        second.next = head;
        second.next.next = swapPairs(head.next);
        return res;
    }
}

