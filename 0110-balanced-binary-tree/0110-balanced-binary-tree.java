/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        TreeNode head=root;
        if(head==null)
            return 0;
        else
        return Math.max(maxDepth(head.left),maxDepth(head.right))+1;
    }
    public boolean isBalanced(TreeNode root) {
        TreeNode head=root;
        if(head==null)
            return true;
        if(Math.abs(maxDepth(head.left)-maxDepth(head.right))!=0 && Math.abs(maxDepth(head.left)-maxDepth(head.right))!=1)
        return false;
        if(!isBalanced(head.left)||!isBalanced(head.right))
            return false; 
        return true;
    }
}