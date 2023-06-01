package src;

import java.util.Stack;

public class AddTwoNumbersInLinkedList {

    class ListNode {

        int val;
        ListNode next;

        ListNode() { }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        Stack<Integer> s1 = listToStack(l1);
        Stack<Integer> s2 = listToStack(l2);

        ListNode head = null;
        int carry = 0;
        
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {

            int sum = carry;

            if (!s1.isEmpty()) sum = sum + s1.pop();

            if (!s2.isEmpty()) sum = sum + s2.pop();

            ListNode node = new ListNode();
            
            node.val = sum % 10;

            node.next = head;

            head = node;

            carry = sum / 10;
        }

        return head;

    }

    private Stack<Integer> listToStack(ListNode list1) {

        Stack<Integer> stack = new Stack<>();

        while (list1 != null) {

            stack.add(list1.val);
            list1 = list1.next;
        }

        return stack;

    }
    
}
