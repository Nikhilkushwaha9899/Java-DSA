import java.util.*;


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class palindrome_Linkedlist{
    //Find middle node function
    public ListNode findMiddle(ListNode head){
        ListNode ptr1=head;
        ListNode ptr2=head;
        while(ptr2.next!=null && ptr2.next.next!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next.next;
        }
        
        return ptr1;
    }
    //reverse second half function
    public ListNode reverse(ListNode head){
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
        return prev;
    }
    //main function
    public boolean isPalindrome(ListNode head) {
        if(head ==null || head.next ==null){
            return true;
        }
        // middle
        ListNode middle=findMiddle(head);
        //reverse second half
        middle.next=reverse(middle.next);
        //compare
        ListNode first=head;
        ListNode second=middle.next;
        while(second!=null){
            if(first.val!=second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
    }
    public static void main(String[] args) {
        palindrome_Linkedlist pll=new palindrome_Linkedlist();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        boolean ans = pll.isPalindrome(head);

        if (ans) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}