class Solution {
    public int minPathSum(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        if(grid.length==1 && grid[0].length==1)
            return grid[0][0];
        int sum1=0,sum2=0;
        for(int i=0;i<m;i++)
        {
           
            dp[i][0]=sum2+grid[i][0];
            sum2=dp[i][0];
        } 
        for(int i=0;i<n;i++)
        {
            dp[0][i]=sum1+grid[0][i];
            sum1=dp[0][i];
        }
        for(int i=1;i<m;i++)
            for(int j=1;j<n;j++)
            {
                dp[i][j]=Math.min(dp[i][j-1],dp[i-1][j])+grid[i][j];
            }
        return dp[m-1][n-1];
        
    }
}