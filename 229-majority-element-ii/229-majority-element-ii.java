class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int maj1=nums[0],maj2=nums[0],ct1=0,ct2=0,len=nums.length;
        if(len==0)
            return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==maj1)
                ct1++;
            else if(nums[i]==maj2)
                ct2++;
            else if(ct1==0)
            {
                maj1=nums[i];
                ct1=1;
            }
            else if(ct2==0)
            {
                maj2=nums[i];
                ct2=1;
            }
            else
            {
                ct1--;
                ct2--;
            }
        }
        ct1=0;
        ct2=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==maj1)
                ct1++;
            else if(nums[i]==maj2)
                ct2++;
        }
        if(ct1>len/3)
            result.add(maj1);
        if(ct2>len/3)
            result.add(maj2);
        
        return result;
    }
}