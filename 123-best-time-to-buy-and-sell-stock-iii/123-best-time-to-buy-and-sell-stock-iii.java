class Solution {
    public int maxProfit(int[] prices) {
        int k=2;
        int[][]dp=new int[k+1][prices.length];
        for(int i=1;i<dp.length;i++)
        {
            int maxDiff=-prices[0];
            for(int j=1;j<dp[0].length;j++)
            {
                dp[i][j]=Math.max(dp[i][j-1],maxDiff+prices[j]);
                maxDiff=Math.max(maxDiff,dp[i-1][j]-prices[j]);
            }
        }
        return dp[dp.length-1][dp[0].length-1];
        
        
    }
}