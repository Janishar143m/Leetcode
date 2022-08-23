class Solution {
    public int findMin(int[] nums) {
        
        int low=0,high=nums.length-1;
        if(low==high && low==0)
            return nums[0];
        if(nums[low]<nums[high])
            return nums[low];
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>=nums[0])
                low=mid+1;
            else
            {
                if(mid>0 && nums[mid]>nums[mid-1] && nums[mid]<nums[mid+1])
                    high=mid-1;
/*else if((mid>0 && nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])||(mid==0 && nums[mid]>nums[mid+1]))
                    low=mid+1;*/
                else 
                   return nums[mid]; 
            }
        }
        return -1;
        
        
    }
}