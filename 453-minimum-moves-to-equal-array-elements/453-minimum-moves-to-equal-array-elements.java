class Solution {
    public int minMoves(int[] nums) {
        
        int n=nums.length;
        int min=Integer.MAX_VALUE,sum=0;
        for(int a:nums)
        {
           sum+=a;
           min=Math.min(min,a); 
        }  
        return sum-min*n;    
        
        
    }
}