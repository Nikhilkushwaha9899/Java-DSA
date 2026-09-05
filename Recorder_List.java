import java.util.*;

public class Recorder_List {
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

    public void reorderList(ListNode head) {
        List<ListNode> l = new ArrayList<>();
        if (head == null || head.next == null) {
            return;
        }
        ListNode curr = head;
        while (curr != null) {
            l.add(curr);
            curr = curr.next;
        }
        int le = 0;
        int ri = l.size() - 1;
        while (le < ri) {
            l.get(le).next=l.get(ri);
            le++;
            if (le == ri) {
           break;
        }
            l.get(ri).next=l.get(le);
            ri--;
        }
        l.get(le).next=null;
    }

    public static void main(String[] args) {
        Recorder_List rl = new Recorder_List();
        ListNode head = rl.new ListNode(1);
        head.next = rl.new ListNode(2);
        head.next.next = rl.new ListNode(3);
        head.next.next.next = rl.new ListNode(4);
        head.next.next.next.next = rl.new ListNode(5);
        rl.reorderList(head);
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
