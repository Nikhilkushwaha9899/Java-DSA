import java.util.*;

public class Merge_K_Lists {

    public static class ListNode {
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

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        List<Integer> l = new ArrayList<>();

        for (ListNode node : lists) {
            ListNode curr = node;

            while (curr != null) {
                l.add(curr.val);
                curr = curr.next;
            }
        }

        l.sort(null);

        ListNode head2 = new ListNode(0);
        ListNode curr2 = head2;

        for (int value : l) {
            curr2.next = new ListNode(value);
            curr2 = curr2.next;
        }

        return head2.next;
    }

    public static void main(String[] args) {

        Merge_K_Lists mkl = new Merge_K_Lists();

        ListNode[] lists = {
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6))
        };

        ListNode result = mkl.mergeKLists(lists);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
