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
    public int maxLevelSum(TreeNode root) {
        int level=1,maxLevel=0,sum=0,maxSum=Integer.MIN_VALUE;
        Queue<TreeNode> queue=new ArrayDeque<>();
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            sum=0;
            for(int i=0;i<size;i++)
            {
              TreeNode node=queue.poll();
               sum+=node.val; 
                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right!=null)
                    queue.offer(node.right);
                
            } 
            if(sum>maxSum)
            {
                maxSum=sum;
                maxLevel=level;
            }
            level++;
            
        }
        return maxLevel;
        
    }
}