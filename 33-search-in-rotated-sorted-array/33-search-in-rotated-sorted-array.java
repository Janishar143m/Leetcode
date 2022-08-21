class Solution {
    public int search(int[] nums, int target) {
        
        int low=0,high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>=nums[0])
            {
                if(nums[mid]<target || target<nums[0])
                    low=mid+1;
                else
                    high=mid-1;
            }
            else
            {
                if(target>nums[nums.length-1]||nums[mid]>target)
                    high=mid-1; 
                else
                    low=mid+1;
            }
        }
        return -1;
        
    }
}