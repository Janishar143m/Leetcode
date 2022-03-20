class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==0)
            return -1;
        if(nums.length==1)
            return 0;
        int low=0;
        int high=nums.length;
        int result=findPeakElementUtil(nums,low,high);
        return result;
        
    }
    public int findPeakElementUtil(int[] nums,int low,int high)
    {
        int result=-1;
        if(low<=high)
        {
            int mid=low+(high-low)/2;
            if((mid==0||(mid!=0 && nums[mid-1]<nums[mid])) && (mid==nums.length-1|| (mid!=nums.length-1 && nums[mid]>nums[mid+1])))
                return mid;
            else if((mid==0 ||(mid!=0 && nums[mid]>nums[mid-1])) && (mid==nums.length-1||(mid!=nums.length-1 && nums[mid]<nums[mid+1])))
                result=findPeakElementUtil(nums,mid+1,high);
            else
                result=findPeakElementUtil(nums,low,mid-1);
        }
        return result;
    }
}