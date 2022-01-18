class Solution {
    public int findShortestSubArray(int[] nums) {
        int degree=0,res=0;
        Map<Integer,Integer> firstPos=new HashMap<>();
        Map<Integer,Integer>count=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            firstPos.putIfAbsent(nums[i],i);
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
            if(count.get(nums[i])>degree)
            {
                degree=count.get(nums[i]);
                res=i-firstPos.get(nums[i])+1;
            }
            else if(count.get(nums[i])==degree)
            {
                res=Math.min(res,i-firstPos.get(nums[i])+1);
            }
            
        }
        return res;
        
        
    }
}