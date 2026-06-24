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

public class remove_nth_node {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        int size = 0;
        ListNode curr = head;

        while (curr != null) {
            curr = curr.next;
            size++;
        }

        if (size == n) {
            return head.next;
        }

        int index = size - n;
        ListNode prev = head;
        int i = 1;

        while (i < index) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        remove_nth_node rnn = new remove_nth_node();
        head = rnn.removeNthFromEnd(head, 2);
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}