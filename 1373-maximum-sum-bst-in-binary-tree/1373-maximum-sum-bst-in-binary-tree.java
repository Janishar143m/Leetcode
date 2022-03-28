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
class ResultProperties
{
    TreeNode root;
    Boolean flag=true;
    int min;
    int max;
	int sum;
    ResultProperties(TreeNode root)
    {
        this.root=root;
        this.min=root.val;
        this.max=root.val;
		this.sum=root.val;
    }
    
}
class Solution {
    int max_value=0;
    public int maxSumBST(TreeNode root) {
        
        maxSumBSTUtil(root);
        return max_value;
        
    } 
    public void maxSumBSTUtil(TreeNode root)
    {
	    
        if(root==null)
            return;
        findValidList(root);
    }
    public ResultProperties findValidList(TreeNode root)
    {
	   
        if(root==null)
            return null;
        ResultProperties propLeft=findValidList(root.left);
		ResultProperties propRight=findValidList(root.right);
		ResultProperties propCurrent=new ResultProperties(root);
        if(propLeft!=null )
        {
           
		   propCurrent.sum+=propLeft.sum;
		   propCurrent.min=Math.min(propLeft.min,root.val);
		   propCurrent.max=Math.max(propLeft.max,root.val);
		   propCurrent.flag=propLeft.flag==true && propLeft.max<root.val;
         
        }
		  if(propRight!=null)
        {
           
		   propCurrent.sum+=propRight.sum;
		   propCurrent.min=Math.min(propCurrent.min,propRight.min);
		   propCurrent.max=Math.max(propCurrent.max,propRight.max);
		   propCurrent.flag=propCurrent.flag&&propRight.flag==true && propRight.min>root.val;
         
        }
		if(propCurrent.flag)
		 max_value=Math.max(max_value,propCurrent.sum);  
        
     return propCurrent;   
		
    }
     
   
}