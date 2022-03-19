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
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        pathSumUtil(root,targetSum,0,list);
        return result;
        
    }
    public void pathSumUtil(TreeNode root,int targetSum,int currentSum,List<Integer> list)
    {
       
        if(root==null)
            return;
        list.add(root.val);
         List list1=new ArrayList<>(list);
        List list2=new ArrayList<>(list);
        int newSum=currentSum+root.val;
        if((newSum==targetSum) && (root.left==null && root.right==null))
        {
            result.add(list);
            return;
        }   
        pathSumUtil(root.left,targetSum,newSum,list1);
        pathSumUtil(root.right,targetSum,newSum,list2);
    }
}