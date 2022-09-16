class Trie {
    Node root;
    public Trie() {
        root=new Node('\0');
        
    }
    
    public void insert(String word) {
        Node curr=root;
        for(char c:word.toCharArray())
        {
            if(curr.children[c-'a']==null)
                curr.children[c-'a']=new Node(c);
            curr=curr.children[c-'a'];
            
        }
        curr.end_of_String=1;
        
    }
    
    public boolean search(String word) {
        
        Node curr=root;
        for(char c:word.toCharArray())
        {
            if(curr.children[c-'a']==null)
                return false;
            curr=curr.children[c-'a'];
            
        }
        return  curr.end_of_String==1?true:false;
        
    }
    
    public boolean startsWith(String prefix) {
        Node curr=root;
         for(char c:prefix.toCharArray())
        {
            if(curr.children[c-'a']==null)
                return false;
            curr=curr.children[c-'a'];
            
        }
        return true;
        
    }
    
    class Node
    {
        private char value;
        private int end_of_String;
        private Node[] children;
        
        Node(char Value)
        {
            value=Value;
            end_of_String=0;
            children=new Node[26];
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */