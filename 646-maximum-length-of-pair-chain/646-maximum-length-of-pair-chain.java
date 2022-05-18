class Solution {
    public int findLongestChain(int[][] pairs) {
        {
            Arrays.sort(pairs,(a,b)->a[0]-b[0]);
            int ct=0;
            int dp[]=new int[pairs.length];
            int maximum;
            for(int i=0;i<pairs.length;i++)
                 dp[i]=1;
            maximum=dp[0];
            for(int i=1;i<pairs.length;i++)
            {
            for(int j=0;j<i;j++)
                    if(pairs[i][0]>pairs[j][1] && dp[i]<dp[j]+1)
                        dp[i]=dp[j]+1;
             maximum=Math.max(maximum,dp[i]);  
            } 
            return maximum;
                
            
            
        }
        
        
        
    }
}