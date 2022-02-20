class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int oddIndex=1,evenIndex=0;
        int result[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                result[evenIndex]=nums[i];
                evenIndex+=2;
            }
            else
            {
                result[oddIndex]=nums[i];
                oddIndex+=2;
            }
        }
        return result;
        
    }
}