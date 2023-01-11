class Solution {
    int area=0;
    int maxArea=0;
    public int maxAreaOfIsland(int[][] grid) {
        
        for(int row=0;row<grid.length;row++)
        {
            for(int col=0;col<grid[0].length;col++)
            {
                if(grid[row][col]==1)
                {
                    area=0;
                    calculateArea(row,col,grid.length,grid[0].length,grid);
                    if(area>maxArea)
                    {
                        maxArea=area;
                    }
                }
            }
        }
        return maxArea;
        
    }
    private void calculateArea(int i,int j,int row,int col,int[][] grid)
    {
         if(i<0||i>=row||j<0||j>=col||grid[i][j]!=1)
             return;
         area++;
        grid[i][j]=-1;
        calculateArea(i-1,j,row,col,grid);
        calculateArea(i+1,j,row,col,grid);
        calculateArea(i,j+1,row,col,grid);
        calculateArea(i,j-1,row,col,grid);
         
    }
}