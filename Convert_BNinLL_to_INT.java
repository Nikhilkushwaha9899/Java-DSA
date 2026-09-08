import java.util.*;

public class Convert_BNinLL_to_INT {
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

    public int getDecimalValue(ListNode head) {
        int digit = 0;
        ListNode curr = head;
        while (curr != null) {
            digit = digit * 2 + curr.val;
            curr = curr.next;
        }
        return digit;
    }

    public static void main(String[] args) {
        Convert_BNinLL_to_INT cbn = new Convert_BNinLL_to_INT();
        ListNode head = cbn.new ListNode(0);
        head.next = cbn.new ListNode(0);
        head.next.next = cbn.new ListNode(1);
        System.out.println(cbn.getDecimalValue(head));
    }
}
