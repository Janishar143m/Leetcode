class Solution {
    double [][]dp;
    public double largestSumUtil(int i,int k,int[] nums)
    {
        if(i==nums.length)
            return 0;
        if(k==0)
            return Integer.MIN_VALUE;
        if(dp[i][k]!=0)
            return dp[i][k];
        double sum=0;
        double avg=0;
        for(int j=i;j<nums.length;j++)
        {
            sum+=nums[j];
            avg=Math.max(avg,sum/(j-i+1)+largestSumUtil(j+1,k-1,nums));
            
        }
        dp[i][k]=avg;
        return avg;
    }
    public double largestSumOfAverages(int[] nums, int k) {
        
        double result;
        dp=new double[nums.length+1][nums.length+1];
        result=largestSumUtil(0,k,nums);
        return result;
        
    }
}