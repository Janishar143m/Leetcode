class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[i+1])
                break;
        }
        return nums[i];
        
    }
}