class Solution {
    Map<Long,Long> map=new HashMap<Long,Long>();
    private long getBucket(long val,long size)
    {
        return (val<0)?(val-(size-1))/size:val/size;
    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
       
        long w=(long)t+1;
        for(int i=0;i<nums.length;i++)
        {
          long val=getBucket(nums[i],w);
          if(map.containsKey(val))
              return true;
           if(map.containsKey(val-1) && (Math.abs(map.get(val-1)-nums[i])<w))
              return true;
            if(map.containsKey(val+1) && (Math.abs(map.get(val+1)-nums[i])<w))
              return true;
            map.put(val,(long)nums[i]);   
            if(i>=k)
               map.remove(getBucket(nums[i-k],w));
            
        }
        return false;
        
        
    }
}