import java.util.*;

public class Insertion_Sort_List {
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

    public ListNode insertionSortList(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            l.add(curr.val);
            curr = curr.next;
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
        Insertion_Sort_List isl = new Insertion_Sort_List();
        Sort_LL sl = new Sort_LL();
        ListNode head = isl.new ListNode(-1);
        head.next = isl.new ListNode(5);
        head.next.next = isl.new ListNode(3);
        head.next.next.next = isl.new ListNode(4);
        ListNode result = isl.insertionSortList(head);
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
