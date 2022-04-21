class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int ct=0,maxValue=0;
        boolean greater=false,smaller=false;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                smaller=false;
                greater=false;
                ct=0;
            }
            else if(!greater && !smaller)
            {
               if(arr[i]<arr[i+1])
                {
                    ct++;
                    smaller=true;
                }
                else if(arr[i]>arr[i+1])
                {
                    ct++;
                    greater=true;
                }
            }
            else if(greater)
            {
                if(arr[i]<arr[i+1])
                {
                    ct++;
                    smaller=true;
                    greater=false;
                }
                else
                    ct=1;
                    
            }
            else if(smaller)
            {
                 if(arr[i]>arr[i+1])
                {
                    ct++;
                    greater=true;
                     smaller=false;
                }
                else
                    ct=1;
            }
            maxValue=Math.max(maxValue,ct);
            
        }
        return maxValue+1;
    }
}