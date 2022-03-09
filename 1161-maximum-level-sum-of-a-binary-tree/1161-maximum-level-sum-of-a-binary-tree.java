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
    Map<Integer,Integer> map=new TreeMap<>();
    public int maxLevelSum(TreeNode root) {
         int maxValue=Integer.MIN_VALUE;
        int maxLevel=0;
        maxLevelSumUtility(root,1);
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()>maxValue)
            {
                maxValue=entry.getValue();
                maxLevel=entry.getKey();
            }
        }
        return maxLevel;
            
        
    }
    public void maxLevelSumUtility(TreeNode root,int level)
    {
        if(root==null)
            return;
        map.put(level,map.getOrDefault(level,0)+root.val);
        maxLevelSumUtility(root.left,level+1);
        maxLevelSumUtility(root.right,level+1);
        
    }
}