class Solution {
    public int rob(int[] nums) {
        
        int[] maxAmount=new int[nums.length];
        if(nums.length==1)
            return nums[0];
            
        
        maxAmount[0]=nums[0];
        maxAmount[1]=Math.max(nums[1],nums[0]);
        for(int i=2;i<nums.length;i++)
        {
            maxAmount[i]=Math.max(maxAmount[i-2]+nums[i],maxAmount[i-1]);

        }
        return maxAmount[nums.length-1];
    }
}