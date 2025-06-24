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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int size=0, mid=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
       mid=(int)Math.ceil(size/2);
       for(int i=0;i<mid;i++){
        head=head.next;
       }
       return head;
    }
}