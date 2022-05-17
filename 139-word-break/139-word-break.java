class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int strLen=s.length();
        boolean dp[]=new boolean[strLen+1];
        dp[strLen]=true;
        for(int i=strLen-1;i>=0;i--)
        {
            for(String word:wordDict)
            {
                if(i+word.length()<=strLen && s.substring(i,i+word.length()).equals(word))
                    dp[i]=dp[i+word.length()];
                if(dp[i]==true)
                    break;
            }
        }
        return dp[0];
        
    }
}