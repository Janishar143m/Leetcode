/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
   private int i=0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        List<String> list=new ArrayList<>();
        serialUtil(root,list);
        return String.join(",",list);
    }
    
    private void serialUtil(TreeNode root,List<String> list)
    {
        if(root==null)
        {
            list.add("N");
            return;
        }   
        list.add(String.valueOf(root.val));
        serialUtil(root.left,list);
        serialUtil(root.right,list);
    }  

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        String[] tokens=data.split(",");
        return deserialUtil(tokens);
        
        
    }
    
    private TreeNode deserialUtil(String[] tokens)
    {
        String token=tokens[this.i];
        if(token.equals("N"))
        {
            this.i++;
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(token));
        this.i++;
        root.left=deserialUtil(tokens);
        root.right=deserialUtil(tokens);
        return root;
        
        
    }
    
    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));