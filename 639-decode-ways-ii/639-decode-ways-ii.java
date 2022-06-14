class Solution {
    public long noOfValidStrings(String s)
    {
        long number=0;
        if(s.length()==1)
        {
            if(s.charAt(0)!='*')
            {
                
                if(Integer.parseInt(s)>=1 && Integer.parseInt(s)<10)
                    return 1;
                 else
                     return 0;
                
            }
            else
                return 9;
            
        }
        else
        {
            if(s.charAt(0)=='*' && s.charAt(1)=='*')
                return 15;
            else if(s.charAt(0)=='*' && s.charAt(1)!='*')
            {
                if(Integer.parseInt(s.substring(1,2))>=0 && Integer.parseInt(s.substring(1,2))<=6)
                    return 2;
                else if(Integer.parseInt(s.substring(1,2))>6)
                    return 1;
            }
            else if(s.charAt(0)!='*' && s.charAt(1)=='*')
            {
                if(Integer.parseInt(s.substring(0,1))==1)
                    return 9;
                else if(Integer.parseInt(s.substring(0,1))==2)
                    return 6;
                   
            }
            else if(s.charAt(0)!='*' && s.charAt(1)!='*')
            {
                if (Integer.parseInt(s)>=10 && Integer.parseInt(s)<=26)
                    return 1;
                else
                    return 0;
            }
            
        }
      return 0;
    }
    public int numDecodings(String s) {
        
        
        long[] dp=new long[s.length()];
        dp[0]=noOfValidStrings(s.substring(0,1));
        for(int i=1;i<s.length();i++)
        {
            if(i<=1)
             dp[i]=(dp[i-1]*noOfValidStrings(s.substring(i,i+1))+noOfValidStrings(s.substring(i-1,i+1)))%1000000007;
            else
              dp[i]=(dp[i-1]*noOfValidStrings(s.substring(i,i+1))+noOfValidStrings(s.substring(i-1,i+1))*dp[i-2])%1000000007;  
            
        }   
        return (int)dp[dp.length-1];
            
        

        
    }
}