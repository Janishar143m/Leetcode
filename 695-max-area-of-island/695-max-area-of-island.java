class Solution {
    
    private int count=0;
    private void dfs(int[][] grid,int i,int j,int r,int c)
    {
        if(i<0||i>=r||j<0||j>=c||grid[i][j]!=1)
            return;
        count++;
        grid[i][j]=0;
        dfs(grid,i-1,j,r,c);
        dfs(grid,i+1,j,r,c);
        dfs(grid,i,j+1,r,c);
        dfs(grid,i,j-1,r,c);
    }
    public int maxAreaOfIsland(int[][] grid) {
        
        int r=grid.length;
        int c=grid[0].length;
        int maxArea=0;
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==1)
                {
                    count=0;
                    dfs(grid,i,j,r,c);
                    maxArea=Math.max(maxArea,count);
                }  
                    
            }
        return maxArea;
        
    }
}