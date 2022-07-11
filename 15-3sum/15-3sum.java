class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            if(i==0||i>0 && nums[i]!=nums[i-1])
            {
                int lower=i+1;
                int upper=nums.length-1;
                int sum=-nums[i];
                while(lower<upper)
                {
                    if(nums[lower]+nums[upper]==sum)
                    {
                        result.add(Arrays.asList(nums[i],nums[lower],nums[upper]));
                        while( lower<upper && nums[lower]==nums[lower+1])
                            lower++;
                        while(lower<upper && nums[upper]==nums[upper-1])
                            upper--;
                        lower++;
                        upper--;
                    }  
                    else if(nums[lower]+nums[upper]<sum)
                        lower++;
                    else
                        upper--;
                }
            } 
                
        }
        return result;
        
    }
}