class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ct=0,maxCount=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                ct++;
            }
            else
            {
                maxCount=Math.max(maxCount,ct);
                ct=0;
            }
        }
        maxCount=Math.max(maxCount,ct);
        return maxCount;
        
    }
}