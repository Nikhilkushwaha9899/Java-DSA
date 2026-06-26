import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Linked_list_cycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
          return false;
        }
        ListNode ptr1 =head;
        ListNode ptr2 =head;
        while(ptr2 !=null && ptr2.next!=null){
          ptr1=ptr1.next;
          ptr2=ptr2.next.next;
          if(ptr1 == ptr2){
            return true;
          }
        }
        return false;
    }
    public static void main(String[] args) {
    Linked_list_cycle obj = new Linked_list_cycle();

    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(4);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;

    System.out.println(obj.hasCycle(n1));
    }
}