class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int ct=0,max=0;
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==1)
            {
                ct++;
                continue;
            }
            else
            {
                max=Math.max(ct,max);
                ct=0;
            }
        }
        max=Math.max(ct,max);
        return max;
        
    }
}