import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Swap_node_in_pair {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        while (ptr1 != null && ptr2 != null) {
            int temp = ptr1.val;
            ptr1.val = ptr2.val;
            ptr2.val = temp;
            if (ptr2.next == null)
                break;
            ptr1 = ptr2.next;
            ptr2 = ptr1.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Swap_node_in_pair snip = new Swap_node_in_pair();
        System.out.println("Original Linked List");
        printList(head);
        head = snip.swapPairs(head);
        System.out.println("Swapped lnked list");
        printList(head);
    }
}
