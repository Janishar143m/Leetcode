class Solution {
    
    private void mark(char[][]grid,int i,int j,int r,int c)
    {
        if(i<0 ||j<0||i>=r||j>=c||grid[i][j]!='1')
            return;
        grid[i][j]='2';
        mark(grid,i-1,j,r,c);
        mark(grid,i+1,j,r,c);
        mark(grid,i,j+1,r,c);
        mark(grid,i,j-1,r,c);
    }
    
    public int numIslands(char[][] grid) {
        int no_of_islands=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    mark(grid,i,j,grid.length,grid[0].length);
                    no_of_islands+=1;
                }   
            }
        return no_of_islands;
    }
}