/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
     Map<Node,Node>cloneMap=new HashMap<>();
    Set<Integer> set=new HashSet<>();
    public Node cloneNode(Node node)
    {
        if(node==null||set.contains(node.val))
            return null;
      
        set.add(node.val);
        Node clone=new Node(node.val);
        cloneMap.put(node,clone);
        if(node.neighbors.size()>0)
        {
          for(Node adj:node.neighbors)
            cloneNode(adj);
        }     
       
        return clone;
        
    }
    public void  buildAdjacenyList(Node node)
    {
        if(node==null)
            return;
    for(Map.Entry<Node,Node> mp:cloneMap.entrySet())
     {
         Node original=mp.getKey();
         Node clone1=mp.getValue();
        if(original.neighbors.size()>0)   
        {
            for(Node adjNode:original.neighbors)
         {
             clone1.neighbors.add(cloneMap.get(adjNode));
         }
        }    
     }
   
    }    
    
    
    public Node cloneGraph(Node node) 
    {
       
       if(node==null)
            return null;
       Node nodeCopy=cloneNode(node);
       buildAdjacenyList(node); 
       return nodeCopy;  
        
    }
}