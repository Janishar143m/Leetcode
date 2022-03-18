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
    public List<Double> averageOfLevels(TreeNode root) {
        
        Queue<TreeNode> queue=new ArrayDeque<>();
        List<Double> result=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int length=queue.size();
             Double sum=0.0;
            for(int i=0;i<length;i++)
            {
                TreeNode node=queue.poll();
                sum+=node.val;
                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right!=null)
                    queue.offer(node.right);
                
                
            }
            double avg=sum/length;
            result.add(avg);
            
            
        }
        return result;
        
        
    }
}