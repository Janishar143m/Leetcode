class Solution {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int half=sum/2;
        if(half*2!=sum)
            return false;
        boolean[][]dp=new boolean[nums.length+1][half+1];
       
        for(int j=0;j<dp[0].length;j++)
            dp[0][j]=false;
         for(int i=0;i<dp.length;i++)
            dp[i][0]=true;
        for(int i=1;i<dp.length;i++)
            for(int j=1;j<dp[0].length;j++)
            {
                if(j<nums[i-1])
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-nums[i-1]];
                    
            }
        return dp[dp.length-1][dp[0].length-1];
        
        
        
        
    }
}