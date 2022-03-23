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
    int max_value=0;
    public int longestUnivaluePath(TreeNode root) {
         pathCalculator(root);//helps to calculate the univalued path 
        return  max_value;
        
    }
    public int pathCalculator(TreeNode root)
    {
       // int leftCount=0,rightCount=0;
        if(root==null)
            return 0;
        int leftCount=pathCalculator(root.left);
        int rightCount=pathCalculator(root.right);
        int totLeft=0,totRight=0;
        if(root.left!=null && root.left.val==root.val)
            totLeft+=leftCount+1;
        if(root.right!=null && root.right.val==root.val)
            totRight+=rightCount+1;
        max_value=Math.max(max_value,totLeft+totRight);
        return Math.max(totLeft,totRight);
    }
}