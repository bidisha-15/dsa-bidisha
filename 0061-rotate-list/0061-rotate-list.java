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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode temp=head;
        int size=0;
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        size++;
        k=k%size;
        if(k==0){
            return head;
        }
        ListNode temp1=head;
        for(int i=1;i<size-k;i++){
            temp1=temp1.next;
        }
        temp.next=head;
        head=temp1.next;
        temp1.next=null;
        return head;
    }
}