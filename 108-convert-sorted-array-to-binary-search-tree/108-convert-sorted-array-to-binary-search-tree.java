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
    public TreeNode sortedArrayToBST(int[] nums) {    
        int low=0,high=nums.length-1;
        TreeNode root=sortedArrayToBSTUtil(nums,low,high);
        return root;
     
        
    }
    public TreeNode sortedArrayToBSTUtil(int[] nums,int low,int high)
    {
        if(low<=high)
        {
            int mid=low+(high-low)/2;
            TreeNode node=new TreeNode(nums[mid]);
            node.left=sortedArrayToBSTUtil(nums,low,mid-1);
            node.right=sortedArrayToBSTUtil(nums,mid+1,high);
            return node;
        }
        else 
            return null;
        
    }
    
}