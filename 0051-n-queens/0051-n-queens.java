class Solution {
     int[] leftRow;
        int[] belowDiagonal;
        int[] aboveDiagonal;
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        int[][] board=new int[n][n];
       leftRow=new int[board.length];
        belowDiagonal=new int[2*n-1];
        aboveDiagonal=new int[2*n-1];
        solve(result,board,0);
        return result;
        
        
    }
    private void solve(List<List<String>> result,int[][] board,int col)
    {
        if (col==board.length)
        {
            List<String> list=new ArrayList<>();
            convert(board,list);
            result.add(list);
            return;
        }
        for(int row=0;row<board.length;row++)
        {
            if(leftRow[row]==0 && belowDiagonal[row+col]==0 && aboveDiagonal[board.length-1+col-row]==0)
            {
                board[row][col]=1;
                leftRow[row]=1;
                belowDiagonal[row+col]=1;
                aboveDiagonal[board.length-1+col-row]=1;
                solve(result,board,col+1);
                board[row][col]=0;
                leftRow[row]=0;
                belowDiagonal[row+col]=0;
                aboveDiagonal[board.length-1+col-row]=0;
                
                
            }
        }
            
        
    }
    private void convert(int[][] board,List<String> list)
    {
        
        for(int i=0;i<board.length;i++)
        {
            StringBuilder res=new StringBuilder();
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==1)
                {
                    res.append("Q");
                }
                else
                    res.append(".");
            }
            list.add(res.toString());
        }
         
    }
}