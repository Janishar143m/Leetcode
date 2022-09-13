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
    private int count=0;
    private int res=-1;
    public int kthSmallest(TreeNode root, int k) {
        count=0;
        KthSmallestUtil(root,k);
        return res;
    }
    private void KthSmallestUtil(TreeNode root,int k)
    {
     
        if(root==null)
            return;
        KthSmallestUtil(root.left,k);
        if(count==k)
            return;
        count++;
        if(count==k)
        {
            res=root.val;
            return;
        }   
        KthSmallestUtil(root.right,k);
        
    }    
    
        
    }