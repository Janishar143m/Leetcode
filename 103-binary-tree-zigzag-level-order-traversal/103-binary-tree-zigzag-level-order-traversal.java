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
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        Boolean leftToRight=false;
        while(stack.size()>0)
        {
            int size=stack.size();
            List<Integer> list=new ArrayList<>();
            List<TreeNode> list1=new ArrayList<>();

            for(int i=0;i<size;i++)
            {
                TreeNode node=stack.pop();
                
                list.add(node.val);
               
                    
                    if(node.right!=null)
                    {
                       // stack.push(node.right);
                        list1.add(0,node.right);
                        
                    }  
                  if(node.left!=null)
                   {
                       //stack.push(node.left);
                       list1.add(0,node.left);
                   }
                       
               
            }
            list1.stream().forEach(i->stack.push(i));
            if(leftToRight)
            {
                result.add(list);
            }
            else
            {
                Collections.reverse(list);
                result.add(list);    
                
            }   
            
         
            leftToRight=!leftToRight;
            
        }
        return result;
        
        
        
    }
}