class WordDictionary {
   Node root;
    public WordDictionary() {
        root=new Node('\0');
        
    }
    
    public void addWord(String word) {
        Node node=root;
        for(char c:word.toCharArray())
        {
            if(node.nodes[c-'a']==null)
              node.nodes[c-'a']=new Node(c);
            node=node.nodes[c-'a'];
            
        }
        node.isEnd=true;
        
    }
    
    public boolean search(String word) {
       return searchUtil(word,root);
    }
    
    private boolean searchUtil(String word,Node root)
    {
         Node node=root;
        boolean result=false;
        for(int i=0;i<word.length();i++)
        {
            
            char c=word.charAt(i);
            if(c!='.' && node.nodes[c-'a']==null)
                return false;
            else if(c=='.')
            {
               for(int j=0;j<26;j++)
               {
                   if(node.nodes[j]!=null)
                   {
                       result=searchUtil(word.substring(i+1),node.nodes[j]);
                       if(result)
                          return true;
                        
                   }   
               }
          
                return false;
            
                
            }
            node=node.nodes[c-'a'];

        }
        if(node.isEnd)
          return true;
        else
            return false;
            
        
    }
    
    class Node
    {
        char value;
        boolean isEnd;
        Node[] nodes;
        
        Node(char Value)
        {
            this.value=Value;
            isEnd=false;
            nodes=new Node[26];
            
        }
        
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */