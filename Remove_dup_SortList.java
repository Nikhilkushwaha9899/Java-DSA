import java.util.*;

public class Remove_dup_SortList {
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

    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            l.add(curr.val);
            curr = curr.next;
        }
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : l) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        l.removeIf(num -> freq.get(num) > 1);
        ListNode head2 = new ListNode(0);
        ListNode curr2 = head2;
        for (int value : l) {
            curr2.next = new ListNode(value);
            curr2 = curr2.next;
        }
        return head2.next;

    }

    public static void main(String[] args) {
        Remove_dup_SortList rds = new Remove_dup_SortList();
        ListNode head = rds.new ListNode(1);
        head.next = rds.new ListNode(1);
        head.next.next = rds.new ListNode(1);
        head.next.next.next = rds.new ListNode(2);
        head.next.next.next.next = rds.new ListNode(3);
        ListNode result = rds.deleteDuplicates(head);
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
