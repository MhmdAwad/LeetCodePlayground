package problem_solving.meduim.AddTwoNumbers;



public class Solution {
    public Solution() {
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode node = head;
        int carry =0 ;
        while (l1 != null || l2 != null){
            int number1 = l1!=null? l1.val: 0;
            int number2 = l2!=null? l2.val: 0;
            int sum = number1+number2+carry;
            carry = sum / 10;
            node.next = new ListNode(sum % 10);

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            node = node.next;
        }

        if(carry > 0){
            node.next = new ListNode(carry);
            node = node.next;
        }

        return head.next;
    }
}