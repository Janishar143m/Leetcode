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
    TreeNode prev=null,first=null,second=null;
    public void recoverTree(TreeNode root) {
        recoverTreeUtil(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        
        
    }
    
    private void recoverTreeUtil(TreeNode root)
    {
        if(root==null)
            return;
        recoverTreeUtil(root.left);
        if(prev!=null && prev.val>root.val)
        {
            if(first==null)
                first=prev;
            second=root;
        }
        prev=root;
        recoverTreeUtil(root.right);
    }    
        
}        
        
    