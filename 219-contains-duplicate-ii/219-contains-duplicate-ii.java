class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.getOrDefault(nums[i],-1)!=-1)
            {
                int diff=Math.abs(map.get(nums[i])-i);
                if(diff<=k)
                    return true;
                else
                    map.put(nums[i],i);
            }
            else
                map.put(nums[i],i);
        }
        return false;
        
    }
}