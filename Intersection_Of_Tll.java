import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}
public class Intersection_Of_Tll {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode ptr1 = headA;
    while (ptr1 != null) {
        ListNode ptr2 = headB;
        while (ptr2 != null) {
            if (ptr1 == ptr2) {
                return ptr1;
            }
            ptr2 = ptr2.next;
        }
        ptr1 = ptr1.next;
    }
    return null;
    }
}
