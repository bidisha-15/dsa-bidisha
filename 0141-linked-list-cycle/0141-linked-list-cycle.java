/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr1=head, curr2=head;
        while(curr1!=null && curr1.next!=null)
        {
            curr1=curr1.next.next;
            curr2=curr2.next; 
            if(curr1==curr2)
            {return true;}
        }
         return false;
    }
}