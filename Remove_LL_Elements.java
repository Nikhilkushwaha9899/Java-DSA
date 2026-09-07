import java.util.*;

public class Remove_LL_Elements {
    public class ListNode {
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

    public ListNode removeElements(ListNode head, int val) {
        List<Integer> l = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            if (curr.val != val) {
                l.add(curr.val);
            }
            curr = curr.next;
        }
        ListNode head2 = new ListNode(0);
        ListNode curr2 = head2;
        for (int value : l) {
            curr2.next = new ListNode(value);
            curr2 = curr2.next;
        }
        return head2.next;
    }

    public static void main(String[] args) {
        Remove_LL_Elements rle = new Remove_LL_Elements();
        ListNode head = rle.new ListNode(1);
        head.next = rle.new ListNode(2);
        head.next.next = rle.new ListNode(6);
        head.next.next.next = rle.new ListNode(3);
        head.next.next.next.next = rle.new ListNode(4);
        head.next.next.next.next.next = rle.new ListNode(5);
        head.next.next.next.next.next.next = rle.new ListNode(6);
        int val = 6;
        ListNode result = rle.removeElements(head, val);
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}