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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum=null;
        int carry=0;
        ListNode trav=null;
        while(l1!=null || l2!=null || carry!=0)
        {
            int s=carry;
            if(l1!=null)
            {
                s+=l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                s+=l2.val;
                l2=l2.next;
            }
            carry=s/10;
            ListNode temp=new ListNode(s%10);
            if(sum==null)
            {
                sum=temp;
                trav=temp;
            }
            else
            {
                trav.next=temp;
                trav=trav.next;
            }
        }
        return sum;
    }
}