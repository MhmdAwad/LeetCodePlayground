import problem_solving.meduim.AddTwoNumbers.ListNode;
import problem_solving.meduim.AddTwoNumbers.Solution;

public class Main {

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode();
        listNode1.val = 2;
        listNode2.val = 4;
        listNode3.val = 3;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        ListNode listNode4 = new ListNode();
        ListNode listNode5 = new ListNode();
        ListNode listNode6 = new ListNode();
        listNode4.val = 5;
        listNode5.val = 6;
        listNode6.val = 4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        Solution.addTwoNumbers(listNode1, listNode4);
    }


}
