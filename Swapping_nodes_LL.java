import java.util.*;

public class Swapping_nodes_LL {
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

    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> l = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            l.add(curr.val);
            curr = curr.next;
        }
        int lt = k - 1;
        int rt = l.size() - k;
        Collections.swap(l, lt, rt);
        ListNode head2 = new ListNode(0);
        ListNode curr2 = head2;
        for (int value : l) {
            curr2.next = new ListNode(value);
            curr2 = curr2.next;
        }
        return head2.next;
    }

    public static void main(String[] args) {
        Swapping_nodes_LL sn = new Swapping_nodes_LL();
        int k = 5;
        ListNode head = sn.new ListNode(7);
        head.next = sn.new ListNode(9);
        head.next.next = sn.new ListNode(6);
        head.next.next.next = sn.new ListNode(6);
        head.next.next.next.next = sn.new ListNode(7);
        head.next.next.next.next.next = sn.new ListNode(8);
        head.next.next.next.next.next.next = sn.new ListNode(3);
        head.next.next.next.next.next.next.next = sn.new ListNode(0);
        head.next.next.next.next.next.next.next.next = sn.new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = sn.new ListNode(5);
        ListNode result = sn.swapNodes(head, k);
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}