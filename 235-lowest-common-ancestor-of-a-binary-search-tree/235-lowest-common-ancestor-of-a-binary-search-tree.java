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
        TreeNode result=null;
        result=lowestCommonAncestorUtil(root,p,q);
        return result;
       
        
        
    }
    public TreeNode lowestCommonAncestorUtil(TreeNode root,TreeNode p, TreeNode q)
    {
        TreeNode result=null;
         if((p.val<root.val && q.val>root.val)||(p.val>root.val && q.val<root.val))
            result=root;
         if(p.val==root.val||q.val==root.val)
             result=root;
        if(p.val<root.val && q.val<root.val)
            result=lowestCommonAncestor(root.left,p,q);
        if(p.val>root.val && q.val>root.val)
            result=lowestCommonAncestor(root.right,p,q);
        return result;
    }
    
}