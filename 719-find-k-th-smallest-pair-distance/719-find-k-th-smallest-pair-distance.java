class Solution {
    public int countElements(int nums[],int mid)
    {
        int res=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int j=i+1;
            while(j<n && nums[j]-nums[i]<=mid)
                j++;
            res+=j-i-1;
        }
        return res;
    }
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int low=nums[1]-nums[0];
        for(int i=1;i<n-1;i++)
            low=Math.min(low,nums[i+1]-nums[i]);
        int high=nums[n-1]-nums[0];
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(countElements(nums,mid)<k)
                low=mid+1;
            else
                high=mid;
        }
        return low;
        
    }
}