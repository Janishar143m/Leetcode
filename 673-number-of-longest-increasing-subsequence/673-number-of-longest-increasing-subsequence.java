class Solution {
    public int findNumberOfLIS(int[] nums) {
        
        int dp[]=new int[nums.length];
        int count[]=new int[nums.length];
        int maxLen=1;
        Arrays.fill(dp,1);
        Arrays.fill(count,1);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i])
                {
                    if(dp[j]+1>dp[i])
                    {
                        dp[i]=dp[j]+1;
                        count[i]=count[j];
                    }
                    else if(dp[j]+1==dp[i])
                        count[i]+=count[j];
                }
            }
            maxLen=Math.max(maxLen,dp[i]);
           // System.out.println(maxLen);
            
        }
        int totCount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(dp[i]==maxLen)
                totCount+=count[i];
        }
        return totCount;
            
        
    }
}