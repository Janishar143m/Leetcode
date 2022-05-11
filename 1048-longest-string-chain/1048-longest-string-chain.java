class Solution {
    public boolean compare(String first,String second)
    {
        if(first.length()!=second.length()+1)
            return false;
        int i=0;
        int j=0;
        while(i<first.length())
        {
            if(j<second.length() && first.charAt(i)==second.charAt(j))
            {
                i++;
                j++;
            }
            else
                i++;
        }
        if(i==first.length() && j==second.length())
            return true;
        else
            return false;
    }
    public int longestStrChain(String[] words) 
    {
        int max=0;
        Arrays.sort(words,(s1,s2)->s1.length()-s2.length());
        //Arrays.stream(words).forEach(System.out::println);
        int[] dp=new int[words.length];
        for(int i=0;i<dp.length;i++)
            dp[i]=1;
        //Arrays.fill(dp,1);
       // max=dp[0];
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(compare(words[i],words[j]) && dp[j]+1>dp[i])
                    dp[i]=dp[j]+1;
                
            }
            max=Math.max(max,dp[i]);
        }    
        return max;
        
    }
}