class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=1,k=1;
        while(i<nums.length)
        {
            if(nums[i]!=nums[i-1])
                nums[k++]=nums[i];
            i++;
        }
        return k;
        
    }
}