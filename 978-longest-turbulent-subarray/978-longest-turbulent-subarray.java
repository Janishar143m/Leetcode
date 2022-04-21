class Solution {
    public int maxTurbulenceSize(int[] arr) {
        boolean smaller=false,greater=false;
        int maxLength=0;
        int ct=0;
        if(arr.length==1)
            return 1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
               if(smaller) 
               {
                   ct++;
                   smaller=false;
               }   
                else
                    ct=1;
                greater=true;
                
            }    
            else if(arr[i]<arr[i-1])
            {
               if(greater) 
               {
                   ct++;
                   greater=false;
               }
               else
                   ct=1;
               smaller=true; 
            }   
            else
            {
                ct=0;
                smaller=false;
                greater=false;
            }
            maxLength=Math.max(maxLength,ct);
            
        }
        return maxLength+1;
        
    }
}