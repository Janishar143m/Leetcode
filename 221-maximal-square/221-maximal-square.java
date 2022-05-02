class Solution {
    public int maximalSquare(char[][] matrix) 
    {
        int max=0;
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++)
            {
                if(i==0||j==0||Character.getNumericValue(matrix[i][j])==0)
                    dp[i][j]=Character.getNumericValue(matrix[i][j]);
                else 
                    dp[i][j]=(Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j])))+1;
                max=Math.max(max,dp[i][j]);
    
             }
        return max*max;
    }
}    