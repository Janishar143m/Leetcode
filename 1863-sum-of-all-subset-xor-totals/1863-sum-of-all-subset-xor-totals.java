class Solution {
    public int subsetSum(int i,int sum,int nums[])
    {
        if(i==nums.length)
            return sum;
        else
            return subsetSum(i+1,sum,nums)+subsetSum(i+1,sum^nums[i],nums);
    }
    public int subsetXORSum(int[] nums) {
        int sum=0;
        sum=subsetSum(0,0,nums);
        return sum;
        
    }
}