class Solution {
    public int missingNumber(int[] nums) {
        
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
            res=res^nums[i];
        for(int i=0;i<=nums.length;i++)
            res=res^i;
        return res;
        
    }
}