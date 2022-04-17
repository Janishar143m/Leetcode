class Solution {
    Map<String,Character> map=new HashMap<>();
    private int isValid(String s)
    {
        if(s.equals("1") || s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9")||s.equals("10")||s.equals("11")||s.equals("12")||s.equals("13")||s.equals("14")||s.equals("15")||s.equals("16")||s.equals("17")||s.equals("18")||s.equals("19")||s.equals("20")||s.equals("21")||s.equals("22")||s.equals("23")||s.equals("24")||s.equals("25")||s.equals("26"))
            return 1;
        else
            return 0;
        
        
    }
    public int numDecodings(String s) {
        
        int[] dp=new int[s.length()];
        dp[0]=isValid(s.substring(0,1));
        for(int i=1;i<s.length();i++)
        {
            if(i<=1)
             dp[i]=dp[i-1]*isValid(s.substring(i,i+1))+isValid(s.substring(i-1,i+1));
            else
              dp[i]=dp[i-1]*isValid(s.substring(i,i+1))+isValid(s.substring(i-1,i+1))*dp[i-2];  
            
        }   
            
        return dp[dp.length-1];
            
        
    }
}