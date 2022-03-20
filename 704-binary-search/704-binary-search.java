class Solution {
    public int search(int[] nums, int target) {
        
        
        
        if(nums.length==0)
            return -1;
        int low=0;
        int high=nums.length-1;
        int result=searchNumber(nums,low,high,target);
        return result;
    
        
    }
    private int searchNumber(int a[],int low,int high,int target)
    {
                int result=-1;
                if(low<=high)
                {
                    int mid=low+(high-low)/2;
                if(a[mid]==target)
                    return mid;
                else if(a[mid]>target)
                    result=searchNumber(a,low,mid-1,target);
                else if(a[mid]<target)
                    result=searchNumber(a,mid+1,high,target);
                }   
                return result;
                
    }
}