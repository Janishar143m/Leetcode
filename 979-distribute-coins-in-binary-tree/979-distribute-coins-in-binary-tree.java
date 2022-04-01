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
    public int distributeCoins(TreeNode root) {
        int result=0;
        int leftCoins=0,rightCoins=0;
        if(root.left!=null)
        {
            result+=distributeCoins(root.left);
            root.val+=root.left.val-1;
            result+=Math.abs(root.left.val-1);
            
        }
        if(root.right!=null)
        {
            result+=distributeCoins(root.right);
            root.val+=root.right.val-1;
            result+=Math.abs(root.right.val-1);

        }
        return result;
        
    }
}