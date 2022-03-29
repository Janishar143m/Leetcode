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
    TreeNode lastLower=null,firstGreater=null;
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode treeNode=new TreeNode(val);
        if(root==null)
            return treeNode;
        insertIntoBSTUtil(root,val);
        if(lastLower==null && firstGreater!=null)
            firstGreater.left=treeNode;
        if(firstGreater==null && lastLower!=null)
            lastLower.right=treeNode;
        if(lastLower!=null && firstGreater!=null)
        {
            if(firstGreater.left!=null)
                lastLower.right=treeNode;
            else
                firstGreater.left=treeNode;
        }
        
        return root;
        
        
    }
    private void insertIntoBSTUtil(TreeNode root,int val)
    {
         if(root==null)
            return;
        insertIntoBSTUtil(root.left,val);
        if(root.val<val)
            lastLower=root;
        if(firstGreater==null && root.val>val)
            firstGreater=root;
        //prev=root;
        insertIntoBSTUtil(root.right,val);

    }
}