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
        pathSumUtil(root,targetSum,list);
        return result;
        
    }
    public void pathSumUtil(TreeNode root,int targetSum,List<Integer> list)
    {
       
        if(root==null)
            return;
        list.add(root.val);
         List list1=new ArrayList<>(list);
        List list2=new ArrayList<>(list);
        int newSum=targetSum-root.val;
        if((newSum==0) && (root.left==null && root.right==null))
        {
            result.add(list);
            return;
        }   
        pathSumUtil(root.left,newSum,list1);
        pathSumUtil(root.right,newSum,list2);
    }
}