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
    int res=0;
     int maxDepth(TreeNode root) {
        TreeNode head=root; 
        if(head==null)
            return 0;
        int lh=maxDepth(head.left);
        int rh=maxDepth(head.right);
        res=Math.max(res,lh+rh);
        return Math.max(lh,rh)+1;
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return res;
    }
}

