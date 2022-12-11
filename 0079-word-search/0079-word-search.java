class Solution {
    List<String> list=new ArrayList<>();
    public boolean exist(char[][] board, String word) {
        
        return existUtil(board,word);
        
    }
    public boolean existUtil(char[][]board,String word)
    {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                if(checkWord(board,word,i,j,0,m,n))
                 return true;
            }
        return false;
    }
    
    public boolean checkWord(char[][]board,String word,int i,int j,int pos,int m,int n)
    {
        boolean result=false;
        if(i<0||i>=m||j<0||j>=n||word.charAt(pos)!=board[i][j])
            return false;
            if(pos==word.length()-1)
                return true;
           board[i][j]+=100;
          result=checkWord(board,word,i+1,j,pos+1,m,n)||checkWord(board,word,i,j+1,pos+1,m,n)||checkWord(board,word,i-1,j,pos+1,m,n)||checkWord(board,word,i,j-1,pos+1,m,n);
            board[i][j]-=100;
                
         return result;
    }
}