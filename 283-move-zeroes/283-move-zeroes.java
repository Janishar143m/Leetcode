class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            if(nums[i]!=0)
                nums[k++]=nums[i];
        }
        for(int i=k;i<len;i++)
            nums[k++]=0;
        
    }
}