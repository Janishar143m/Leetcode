class Solution {
    public boolean isMatch(String s, String p) {
        int r=s.length();
        int c=p.length();
        boolean[][] dp=new boolean[r+1][c+1];
        dp[0][0]=true;
        for(int i=1;i<=r;i++)
            dp[i][0]=false;
        //System.out.println(dp[0][1]);
        for(int j=2;j<=c;j++)
            if (p.charAt(j-1)=='*')
                dp[0][j]=dp[0][j-2];
        
        for(int i=1;i<=r;i++)
            for(int j=1;j<=c;j++)
            {
                
             if((s.charAt(i-1)==p.charAt(j-1))||p.charAt(j-1)=='.')
                    dp[i][j]=dp[i-1][j-1];
                else if(p.charAt(j-1)=='*')
                {
                    dp[i][j]=(dp[i][j-2]||((p.charAt(j-2)==s.charAt(i-1) ||p.charAt(j-2)=='.') && dp[i-1][j]));
                }    
                
            
            }
        return dp[dp.length-1][dp[0].length-1];
        
    }
}