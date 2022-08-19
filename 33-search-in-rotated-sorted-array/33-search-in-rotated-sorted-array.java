class Solution {
    public int search(int[] nums, int target) {
        
        int leftLow=0;
        int endHigh=nums.length-1;
        int midVal=0;
        int low=0;
        int high=0;
        for(int i=0;i<nums.length-1;i++)
            if(nums[i]>nums[i+1])
                midVal=i;
        if(target>=nums[leftLow] && target<=nums[midVal])
        {
            low=leftLow;
            high=midVal;
        }
        else if(midVal<endHigh && target>=nums[midVal+1] && target<=nums[endHigh])
        {
            low=midVal+1;
            high=endHigh;
        }
        else return -1;
                
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
                
            
        }
        return -1;
        
        
        
    }
}