class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        
        List<String> result=new ArrayList<>();
        TrieNode root=buildTrie(words);
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
            {
                dfs(i,j,board,root,result);
            }
        return result;
        
    }
    
    private TrieNode buildTrie(String[] words)
    {
        TrieNode root=new TrieNode('\0');
        for(String s:words)
        {
            TrieNode node=root;
            for (char c:s.toCharArray())
            {
                if(node.children[c-'a']==null)
                    node.children[c-'a']=new TrieNode(c);
                node=node.children[c-'a'];
            }
            node.word=s;
        }
        return root;
    }
    
    private void dfs(int i,int j,char[][] board,TrieNode root,List<String>result)
    {
        if(i<0||i>board.length-1||j<0||j>board[0].length-1)
            return;
        char c=board[i][j];
        if(c=='*'||root.children[c-'a']==null)
            return;
        root=root.children[c-'a'];
        if(root.word!=null)
        {
            result.add(root.word);
            root.word=null;
        }
        board[i][j]='*';
        
        dfs(i+1,j,board,root,result);
        dfs(i,j+1,board,root,result);
        dfs(i-1,j,board,root,result);
        dfs(i,j-1,board,root,result);   
        board[i][j]=c;
        
    }
    

    class TrieNode
    {
        char ch;
        String word;
        TrieNode[] children;
        
        TrieNode(char c)
        {
            this.ch=c;
            word=null;
            children=new TrieNode[26];
            
        }
            
    }
    
    
}