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
    public void reorderList(ListNode head) {
        int len=0;
        ListNode curr=head;
        while(curr!=null)
        {
            curr=curr.next;
            len++;
        }
        int[] arr = new int[len];
        curr = head;
        for (int i = 0; i < len; i++) {
            arr[i] = curr.val;
            curr = curr.next;
        }
        
        int[] reorderedArr = new int[len];
        int left = 0, right = len - 1;
        int index = 0;
        while (left <= right) {
            if (index % 2 == 0) {
                reorderedArr[index++] = arr[left++];
            } else {
                reorderedArr[index++] = arr[right--];
            }
        }
        curr = head;
        for (int i = 0; i < len; i++) {
            curr.val = reorderedArr[i];
            curr = curr.next;
        }
    }
}