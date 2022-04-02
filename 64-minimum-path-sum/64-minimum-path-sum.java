class Solution {
    public int minPathSum(int[][] grid) {
        
        int[][] minsum=new int[grid.length][grid[0].length];
        int sum=0;
        for(int i=0;i<grid.length;i++)
        {
            minsum[i][0]=sum+grid[i][0];
            sum=minsum[i][0];
        }
        sum=0;
        for(int j=0;j<grid[0].length;j++)
        {
            minsum[0][j]=sum+grid[0][j];
            sum=minsum[0][j];
        }
        for(int i=1;i<minsum.length;i++)
            for(int j=1;j<minsum[0].length;j++)
                minsum[i][j]=Math.min(minsum[i][j-1],minsum[i-1][j])+grid[i][j];
        return minsum[grid.length-1][grid[0].length-1];
        
        
    }
}