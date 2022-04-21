class Solution {
    public int maxTurbulenceSize(int[] arr) {
        boolean smaller=false,greater=false;
        int maxLength=0;
        int[] dp=new int[arr.length];
        if(arr.length==1)
            return 1;
        if(arr[0]<arr[1])
        {
            dp[0]=1;
            smaller=true;
        }
        else if(arr[0]>arr[1])
        {
            dp[0]=1;
            greater=true;
        }
        maxLength=Math.max(maxLength,dp[0]);
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
               if(smaller) 
               {
                   dp[i]=dp[i-1]+1;
                   smaller=false;
               }   
                else
                    dp[i]=1;
                greater=true;
                
            }    
            else if(arr[i]<arr[i+1])
            {
               if(greater) 
               {
                   dp[i]=dp[i-1]+1;
                   greater=false;
               }
               else
                   dp[i]=1;
               smaller=true; 
            }   
            else
            {
                dp[i]=0;
                smaller=false;
                greater=false;
            }
            maxLength=Math.max(maxLength,dp[i]);
            
        }
        return maxLength+1;
        
    }
}