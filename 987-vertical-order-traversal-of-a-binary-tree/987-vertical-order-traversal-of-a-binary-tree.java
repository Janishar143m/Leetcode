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
    Map<Integer,Map<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result;
        verticalTraversalUtil(root,0,0);
        result=printSortedVerticalOrder();
        return result;
        
    }
    public List<List<Integer>> printSortedVerticalOrder()
    {
        List<List<Integer>>result=new ArrayList<>();
        for(Map<Integer,PriorityQueue<Integer>> entry : map.values())
        {
            List<Integer> list=new ArrayList<>();
            for(PriorityQueue<Integer> queue:entry.values())
                while(!queue.isEmpty())
                {
                    list.add(queue.poll());
                }
            result.add(list);
                
            
        }
        return result;
            
    }
    public void verticalTraversalUtil(TreeNode root,int pos,int level)
    {
        if(root==null)
            return;
        if(!map.containsKey(pos))
        {
           map.put(pos,new TreeMap<>());
        }
        if(!map.get(pos).containsKey(level))
        {
       
            map.get(pos).put(level,new PriorityQueue<>());
           
        }    
        map.get(pos).get(level).offer(root.val);
        verticalTraversalUtil(root.left,pos-1,level+1);
        verticalTraversalUtil(root.right,pos+1,level+1);  
        }
           
    }
