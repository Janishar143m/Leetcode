class Solution {
    public int maxProfit(int[] arr) {
       int max=0,min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
          if(arr[i]>min)
          {
              max+=arr[i]-min;
              min=arr[i];
          }   
           else
               min=arr[i];
        }
        return max;
    }
}