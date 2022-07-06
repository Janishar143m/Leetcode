class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] right=new int[nums.length];
        int[] result=new int[nums.length];
        int prod=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            right[i]=prod;
            prod*=nums[i];
        }
        prod=1;
        for(int i=0;i<nums.length;i++)
        {
            result[i]=right[i]*prod;
            prod*=nums[i];
        }
        return result;
            
        
    }
}