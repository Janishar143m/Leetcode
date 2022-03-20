class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        Arrays.fill(result,-1);
        if(nums.length==0)
            return result;
        
        int low=0;
        int high=nums.length-1;
        result[0]=searchRangeFirst(nums,low,high,target);
        result[1]=searchRangeLast(nums,low,high,target);
        return result;
    }
    private int searchRangeFirst(int[]a,int low,int high,int target)
    {
               int result=-1;
                if(low<=high)
                {
                    int mid=low+(high-low)/2;
					if((mid==0 && a[mid]==target)||(mid!=0 && a[mid]==target && a[mid-1]!=target))
					 return mid;
                   if(a[mid]>=target)
                    result=searchRangeFirst(a,low,mid-1,target);
                   else if(a[mid]<target)
                    result=searchRangeFirst(a,mid+1,high,target);
                } 
          return result;

    }
     private int searchRangeLast(int[]a,int low,int high,int target)
    {
              int result=-1;
                if(low<=high)
                {
                    int mid=low+(high-low)/2;
					if((mid==a.length-1 && a[mid]==target) ||(mid!=a.length-1 && a[mid]==target && a[mid+1]!=target))
					 return mid;
                   if(a[mid]>target)
                    result=searchRangeLast(a,low,mid-1,target);
                   else if(a[mid]<=target)
                    result=searchRangeLast(a,mid+1,high,target);
                } 
         return result;
    }
}