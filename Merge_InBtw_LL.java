import java.util.*;

public class Merge_InBtw_LL {
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

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        while (curr1 != null) {
            l1.add(curr1.val);
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            l2.add(curr2.val);
            curr2 = curr2.next;
        }
        l1.subList(a, b + 1).clear();
        l1.addAll(a, l2);
        ListNode head2 = new ListNode(0);
        ListNode curr3 = head2;
        for (int value : l1) {
            curr3.next = new ListNode(value);
            curr3 = curr3.next;
        }
        return head2.next;
    }

    public static void main(String[] args) {
        Merge_InBtw_LL mbl = new Merge_InBtw_LL();
        ListNode list1 = mbl.new ListNode(0);
        list1.next = mbl.new ListNode(1);
        list1.next.next = mbl.new ListNode(2);
        list1.next.next.next = mbl.new ListNode(3);
        list1.next.next.next.next = mbl.new ListNode(4);
        list1.next.next.next.next.next = mbl.new ListNode(5);
        list1.next.next.next.next.next.next = mbl.new ListNode(6);
        int a = 2, b = 5;
        ListNode list2 = mbl.new ListNode(1000000);
        list2.next = mbl.new ListNode(1000001);
        list2.next.next = mbl.new ListNode(1000002);
        list2.next.next.next = mbl.new ListNode(1000003);
        list2.next.next.next.next = mbl.new ListNode(1000004);
        ListNode result = mbl.mergeInBetween(list1, a, b, list2);
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
