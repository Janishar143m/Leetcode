class Solution {
    public int maxProduct(int[] nums) {
       // int dp[][]=new int[nums.length][2];
        int mx=nums[0];
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int newmax=0,newmin=0;
            newmax=Math.max(nums[i],Math.max(nums[i]*mx,nums[i]*min));
            newmin=Math.min(nums[i],Math.min(nums[i]*mx,nums[i]*min));
            max=Math.max(max,newmax);
            mx=newmax;
            min=newmin;
        }
        return max;
        
    }
}