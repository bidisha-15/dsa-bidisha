/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;

        int len=0;
        while(curr!=null)
        {
            curr=curr.next;
            len++;
        }
       
        int pos=len-n;
        if(pos==0)
        {
            head=head.next;
            return head;
        }
        ListNode ptr1=head; 
        while(pos>1)
        {
        ptr1=ptr1.next;
        pos--;
        }
        ptr1.next=ptr1.next.next;
        
        return head;
    }
}