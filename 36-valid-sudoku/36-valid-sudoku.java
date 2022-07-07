class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> set=new HashSet<>();
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
            {
                if(board[i][j]!='.')
                {
                    if(set.contains("Row"+i+"value"+board[i][j]))
                        return false;
                      set.add("Row"+i+"value"+board[i][j]);
                     if(set.contains("Column"+j+"value"+board[i][j]))
                        return false;
                      set.add("Column"+j+"value"+board[i][j]);
                    if(set.contains("Row"+i/3+"Column"+j/3+"value"+board[i][j]))
                        return false;
                      set.add("Row"+i/3+"Column"+j/3+"value"+board[i][j]);
                     
                    
                }
            }
        return true;
        
    }
}