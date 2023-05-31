package src;

public class ReverseKGroupsInLinkedList {
    
    class ListNode {
        ListNode next;
        int val;
        ListNode() {

        }
        ListNode(ListNode next, int val) {
            this.next = next;
            this.val = val;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        int count = 0;

        ListNode dummy = new ListNode();

        dummy.next = head;

        ListNode temp = dummy;

        while (temp.next != null) {
            temp = temp.next;
            count++;
        }

        temp = dummy;

        while(temp.next != null) {
 
            if (count < k) break;

            int nodes = k-1;

            ListNode tempNext = temp.next;
            ListNode first = temp.next;
            ListNode second = first.next;

            while (nodes-- > 0) {
                ListNode next = second.next;
                second.next = first;
                first = second;
                second = next;
            }

            count = count - k;

            temp.next = first;
            tempNext.next = second;
            temp = tempNext;

        }

        return dummy.next;

    }


}
