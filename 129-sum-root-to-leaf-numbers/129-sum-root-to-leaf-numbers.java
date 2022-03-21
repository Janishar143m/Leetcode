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
    List<StringBuilder> result=new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        
        findSumNumbers(root,new StringBuilder());
        int totSum=result.stream().mapToInt(i->Integer.parseInt(i.toString())).sum();
        return totSum;
        
    }
    private void findSumNumbers(TreeNode root,StringBuilder currentString)
    {
        if(root==null)
          return;
         currentString.append(root.val);
        if(root.left==null && root.right==null)
        {
             result.add(new StringBuilder(currentString));
            //System.out.println(currentString);
        }   
        findSumNumbers(root.left,currentString); 
        findSumNumbers(root.right,currentString);
        currentString.deleteCharAt(currentString.length() - 1);        
    }
}