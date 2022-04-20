class Solution {
    public int maxProduct(int[] nums) {
        int dp[][]=new int[nums.length][2];
        dp[0][0]=nums[0];
        dp[0][1]=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            dp[i][0]=Math.max(nums[i],Math.max(nums[i]*dp[i-1][0],nums[i]*dp[i-1][1]));
            dp[i][1]=Math.min(nums[i],Math.min(nums[i]*dp[i-1][0],nums[i]*dp[i-1][1]));
            max=Math.max(dp[i][0],max);
        }
        return max;
        
    }
}