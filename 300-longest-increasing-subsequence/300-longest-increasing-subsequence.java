class Solution {
    public int lengthOfLIS(int[] nums) {
        int maxLen=0;
        int[] dp=new int[nums.length];
        //dp[0]=1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i])
                    dp[i]=Math.max(dp[i],1+dp[j]);
                
                
            }
            maxLen=Math.max(maxLen,dp[i]);
        }   
        return maxLen+1;
        
    }
}