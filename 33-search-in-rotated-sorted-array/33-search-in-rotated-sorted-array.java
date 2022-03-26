class Solution {
    public int search(int[] nums, int target) {
        
        int low=0,high=nums.length-1,resultPos=-1;
        int index=searchPartitionIndex(nums);
       //System.out.println(index);
        if(index>0)
        {
           if(target>=nums[index] && target<nums[0])
        {
            
            resultPos=searchPartition(nums,target,index,high);
        }   
        else
        {
            
             resultPos=searchPartition(nums,target,low,index-1);
        }  
        }
        else
            resultPos=searchPartition(nums,target,low,high);
         
           
            
        return resultPos;
        
    }
    
    private int searchPartitionIndex(int[]nums)
    {
        int result=0;
        for(int i=0;i<nums.length-1;i++)
              if(nums[i]>nums[i+1])
              {
                   //System.out.println("Condition true");
                  result=i+1; 
              }
                 
        //System.out.println(i);
        return result;
          
        
            
    }
    private int searchPartition(int nums[],int target,int low,int high)
    {
        int mid=0,index=-1;
        if(low<=high)
        {
             mid=low+(high-low)/2;
            if(nums[mid]==target)
                index=mid;
             else if(nums[mid]<target)
                 index=searchPartition(nums,target,mid+1,high);
             else
                 index=searchPartition(nums,target,low,mid-1);
        }
        //System.out.println(index);
        return index;
       
            
    }
    
}