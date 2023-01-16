class Solution {
    public void solve(char[][] board) 
    {
        int row=board.length;
        int col=board[0].length;
        
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
            {
                if(((i==0 || i==row-1) || (j==0 || j==col-1)) && board[i][j]=='O')
                {
                   check(i,j,row,col,board);
                  
                }
            }
        for(int i=1;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                if(board[i][j]=='O')
                    board[i][j]='X';
        
            }
        }
        
        
         for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
            {
                if( board[i][j]=='T')
                {
                   board[i][j]='O';
                  
                }
            }
        
        
    }
    
    private void check(int i,int j,int row,int col,char[][] board)
    {
        if(i<0 || i>=row || j<0 || j>=col||board[i][j]=='X'||board[i][j]=='T')
            return;
      board[i][j]='T';
      check(i-1,j,row,col,board);
      check(i+1,j,row,col,board);
      check(i,j-1,row,col,board);
      check(i,j+1,row,col,board);  
      
    }
    
}