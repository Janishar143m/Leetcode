class Solution {
     TreeNode prev=null;
    public boolean isValidBST(TreeNode root) {
       
        if(root==null)
            return true;
        if(root.left==null && root.right==null)
            return true;
        return isValidBSTUtil(root);
        
    }
    public boolean isValidBSTUtil(TreeNode root)
    {
        if(root==null)
            return true;
        boolean ls=true,rs=true;
          ls=isValidBSTUtil(root.left);
        if(ls==false)
            return false;
        if(prev!=null && prev.val>=root.val)
            return false;
        prev=root;
          rs=isValidBSTUtil(root.right);
        if(rs==false)
            return false;
        return true;
    }
}