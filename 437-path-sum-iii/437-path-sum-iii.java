class Solution {
    int result;
    public int pathSum(TreeNode root, int targetSum) {
        //List<TreeNode> pathList=new ArrayList<>();
       // int result;
        if(root==null)
            return 0;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while(queue.size()>0)
        {
            TreeNode node=queue.poll();
             pathSumUtil(node,targetSum,new ArrayList<>());
            if(node.left!=null)
                queue.offer(node.left);
            if(node.right!=null)
                queue.offer(node.right);
        }
        return result;
        
    }
    private void pathSumUtil(TreeNode root,int targetSum,List<TreeNode> list)
    {
        if(root==null)
            return;
        list.add(root);
        int newSum=targetSum-root.val;
        if(newSum==0)
            result++;

       pathSumUtil(root.left,newSum,list);
       pathSumUtil(root.right,newSum,list);
       
        list.remove(list.size()-1);
    }
}