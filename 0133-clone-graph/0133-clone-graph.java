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
    Map<Node,Node> map=new HashMap<>();
    Node root=null;
    public Node cloneGraph(Node node) 
    {
      if(node==null)
          return null;  
       cloneNode(node);
        createLinks(node);
        return root;
        
        
        
    }
    
    private void cloneNode(Node node)
    {
        Node newNode=new Node(node.val);
        map.put(node,newNode);
        if(root==null)
        {
            root=newNode;
        }
        for(Node neighbor:node.neighbors)
        {
            if(map.get(neighbor)==null)
            {
                cloneNode(neighbor);
            }   
        }
    }
    private void createLinks(Node node)
    {
        for(Map.Entry<Node,Node>mp:map.entrySet())
        {
           Node original=mp.getKey();
            Node clone=mp.getValue();
            if(original.neighbors.size()>0)
            {
                for(Node neighbor:original.neighbors)
                {
                    clone.neighbors.add(map.get(neighbor));
                }
            }
        }       
        
    }
}