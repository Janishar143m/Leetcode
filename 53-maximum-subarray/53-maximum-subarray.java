class Solution {
    public int maxSubArray(int[] nums) {
        int startWindow=0,sum=0,maxSum=Integer.MIN_VALUE;
        for(int endWindow=0;endWindow<nums.length;endWindow++)
        {
            sum+=nums[endWindow];
            maxSum=Math.max(sum,maxSum);
            while(sum<0)
            {
                sum-=nums[startWindow++];
            }
          
        }
       return maxSum;        
    }
}