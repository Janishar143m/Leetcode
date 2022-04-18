class Solution {
    public int longestPalindromeSubseq(String s) {
        int max=0,start=0;
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++)
            for(int j=i;j>=0;j--)
            {
                boolean leftRightEqual=(s.charAt(i)==s.charAt(j));
                if(i==j)
                {
                    dp[i][j]=1;
                    max=dp[i][j];
                   
                }    
                else if(i-j==1)
                {
                    if(leftRightEqual)
                    {
                        dp[j][i]=2;
                       
                    }    
                    else
                    {
                        dp[j][i]=1;
                        
                        
                    } 
                    
                }
                else
                {
                    if(leftRightEqual && dp[j+1][i-1]!=0)
                    {
                        dp[j][i]=2+dp[j+1][i-1];
                        
                    }   
                    else
                    {
                        dp[j][i]=Math.max(dp[j+1][i-1],dp[j][i-1]);
                        dp[j][i]=Math.max(dp[j][i],dp[j+1][i]);
                         
                    } 
                }
                max=Math.max(max,dp[j][i]);
            }
        
           return max;
              
                
                    
                
            }
        
        
        
    
}