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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        Boolean leftToRight=true;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            //List<TreeNode> list1=new ArrayList<>();

            for(int i=0;i<size;i++)
            {
                TreeNode node=queue.poll();
                
                if(leftToRight)
                  list.add(node.val);
                else
                    list.add(0,node.val);
               
                    
                  
                
                    if(node.left!=null)
                   {
                   
                       queue.offer(node.left);
                   }  
                  
                   if(node.right!=null)
                    {
                        queue.offer(node.right);
                        
                    } 
               
            }
          result.add(list);
          leftToRight=!leftToRight;
            
        }
        return result;
        
        
        
    }
}