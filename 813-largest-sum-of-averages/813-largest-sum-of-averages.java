class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        int n=nums.length;
        if(k>n)
            return 0;
        double dp[][]=new double[n+1][n+1];
       // Arrays.sort(nums);
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            dp[i][i]=nums[i-1]+sum;
            sum=dp[i][i];
        }
        sum=0;
        double prevsum=0;
        for(int i=1;i<=n;i++)
        {
            sum=prevsum+nums[i-1];
            dp[i][1]=sum/i;
            prevsum=sum;
        }
        for(int i=1;i<=n;i++)
            for(int j=1;j<=n;j++)
            {
                if(j!=1 && i>j)
                {
                   sum=0;
                    int ct=0;
                    for(int l=i;l>=1;l--)
                   {
                    sum+=nums[l-1];
                    ct++;
                    if(i-ct>=0)    
                       dp[i][j]=Math.max(dp[i][j],sum/ct+dp[i-ct][j-1]);
                   }
                }
                if (i==n && j==k)
                    break;
                   
            }
        return dp[n][k];
        
        
    }
}
