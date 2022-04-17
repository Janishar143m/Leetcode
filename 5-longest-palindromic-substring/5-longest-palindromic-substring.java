class Solution {
    public String longestPalindrome(String s) {
        
        int[][] dp=new int[s.length()][s.length()];
        int maxLength=1;
        int maxIndex=0; 
        
       /* for(int i=0;i<s.length();i++)
            dp[i][i]=1;*/
        
        for(int i=0;i<s.length()-1;i++)
        {
            dp[i][i]=1;
            if(s.substring(i,i+1).equals(s.substring(i+1,i+2)))
            {
                dp[i][i+1]=1;
                maxLength=Math.max(maxLength,2);
                maxIndex=i;
            }   
        }
        dp[s.length()-1][s.length()-1]=1;
        
        for(int i=2;i<s.length();i++)
            for(int j=0;j<s.length()-i;j++)
            {
                if(s.charAt(j)==s.charAt(j+i))
                {
                    dp[j][j+i]=dp[j+1][j+i-1];
                    if(dp[j][j+i]==1)
                    {
                        if(i+1>maxLength)
                        {
                            maxLength=i+1;
                            maxIndex=j;
                        }   
                    }
                }   
            }
        //System.out.println(maxIndex);
        //System.out.println(maxLength);
        return s.substring(maxIndex,maxIndex+maxLength);
        
        
    }
}