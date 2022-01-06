class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            if(i==0||(i>0 && nums[i]!=nums[i-1]))
            {
                int lower=i+1;
                int higher=nums.length-1;
                int sum=0-nums[i];
                while(lower<higher)
                {
                    if(nums[lower]+nums[higher]==sum)
                    {
                        result.add(Arrays.asList(nums[i],nums[lower],nums[higher]));
                    while(lower<higher && nums[lower]==nums[lower+1])
                         lower++;
                     while(lower<higher && nums[higher]==nums[higher-1])
                         higher--;
                    lower++;
                    higher--;
                    }
                    else if(nums[lower]+nums[higher]>sum)
                        higher--;
                    else
                        lower++;
                    }   
                }
            }
        
        return result;
        
    }
}