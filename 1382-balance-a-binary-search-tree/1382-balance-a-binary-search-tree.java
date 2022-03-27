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
    List<TreeNode> list=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        
        inOrderTraversal(root);
        TreeNode node=createBST(0,list.size()-1);
        return node;
        
        
    }
    private void inOrderTraversal(TreeNode root)
    {
        if(root==null)
            return;
        inOrderTraversal(root.left);
        list.add(root);
        inOrderTraversal(root.right);
    }
    
    private TreeNode createBST(int low,int high)
    {
        TreeNode root=null;
        if(low<=high)
        {
          int mid=low+(high-low)/2;
           root=list.get(mid);
           root.left=createBST(low,mid-1);
           root.right=createBST(mid+1,high);
        }
        return root;
    }
}