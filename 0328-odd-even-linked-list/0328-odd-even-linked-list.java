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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode oddhead=head;
        ListNode evenhead=head.next;
        ListNode oddtemp=oddhead;
        ListNode eventemp=evenhead;
        while(oddtemp!=null && oddtemp.next!=null && eventemp!=null && eventemp.next!=null ){
            oddtemp.next=eventemp.next;
            oddtemp=oddtemp.next;
            eventemp.next=oddtemp.next;
            eventemp=eventemp.next;
        }
        oddtemp.next=evenhead;
        return oddhead;
    }
}