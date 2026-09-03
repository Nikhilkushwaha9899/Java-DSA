import java.util.*;

public class Reverse_LL_II {
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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> l = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            l.add(curr.val);
            curr = curr.next;
        }
        int le = left-1;
        int r = right - 1;
        while (le < r) {
                int temp = l.get(le);
                l.set(le, l.get(r));
                l.set(r, temp);
                le++;
                r--;
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
        Reverse_LL_II rl2 = new Reverse_LL_II();
        int left = 1, right = 2;
        ListNode head = rl2.new ListNode(3);
        head.next = rl2.new ListNode(5);
        // head.next.next = rl2.new ListNode(3);
        // head.next.next.next = rl2.new ListNode(4);
        // head.next.next.next.next = rl2.new ListNode(5);
        ListNode result = rl2.reverseBetween(head, left, right);
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}