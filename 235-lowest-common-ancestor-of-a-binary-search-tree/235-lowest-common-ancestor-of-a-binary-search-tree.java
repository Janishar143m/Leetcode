/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       
        TreeNode resultNode=null;
        if(root==null)
            return null;
        else if((p.val<root.val && q.val>=root.val)||(q.val<root.val && p.val>=root.val)||(p.val<=root.val && q.val>root.val)||(q.val<=root.val && p.val>root.val))
            resultNode=root;
        else if((p.val<root.val && q.val<root.val))
            resultNode=lowestCommonAncestor(root.left,p,q);
        else
            resultNode=lowestCommonAncestor(root.right,p,q);
        
        return resultNode;
        
        
    }
}