import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Linked_list_cycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while (ptr2 != null && ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if (ptr1 == ptr2) {
                ListNode ptr3 = head;
                while (ptr3 != ptr1) {
                    ptr3 = ptr3.next;
                    ptr1 = ptr1.next;
                }
                return ptr3;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Linked_list_cycleII llc2 = new Linked_list_cycleII();
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        ListNode ans = llc2.detectCycle(n1);

        if (ans != null)
            System.out.println(ans.val);
        else
            System.out.println("No Cycle");

    }
}