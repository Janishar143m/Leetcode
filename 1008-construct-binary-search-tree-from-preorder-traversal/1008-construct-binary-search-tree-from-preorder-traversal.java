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
    int i=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode result=bstFromPreorderUtil(preorder,Integer.MAX_VALUE);
        return result;
        
    }
    private TreeNode bstFromPreorderUtil(int[]array,int max_value)
    {
        if(i>array.length-1||array[i]>max_value)
            return null;
        TreeNode node=new TreeNode(array[i++]);
        node.left=bstFromPreorderUtil(array,node.val);
        node.right=bstFromPreorderUtil(array,max_value);
        return node;
    }
}