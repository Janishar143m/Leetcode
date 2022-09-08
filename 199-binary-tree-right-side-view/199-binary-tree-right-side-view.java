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
    private  int current=0;
    List<Integer> result=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        
       rightSideViewUtil(root,1);
        return result;
        
    }
    private void rightSideViewUtil(TreeNode root,int level)
    {
        if(root==null)
            return;
        if(current<level)
        {
            
            current=level;
            result.add(root.val);
            
        }
        rightSideViewUtil(root.right,level+1);
        rightSideViewUtil(root.left,level+1);
        
        
        
    }
}