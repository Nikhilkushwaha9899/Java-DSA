import java.util.*;
public class Middle_of_LL {
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

	public ListNode middleNode(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode ptr1 = head;
		ListNode ptr2 = head;
		while (ptr2 != null && ptr2.next != null) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
		}
		return ptr1;
	}
    public static void main(String[] args) {
        Middle_of_LL mll=new Middle_of_LL();
		ListNode head = mll.new ListNode(1);
		head.next = mll.new ListNode(2);
		head.next.next = mll.new ListNode(3);
		head.next.next.next = mll.new ListNode(4);
		head.next.next.next.next = mll.new ListNode(5);
		ListNode middle = mll.middleNode(head);
		while (middle != null) {
			System.out.print(middle.val + " ");
			middle = middle.next;
		}
    }
}
