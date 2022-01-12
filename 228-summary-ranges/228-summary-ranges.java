class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int len=nums.length,j=0;
        if(len==1)
        {
            list.add(Integer.toString(nums[0]));
            return list;
        }
        for(int i=1;i<len;i++)
        {
            if(nums[i]!=nums[i-1]+1)
            {
                if(i-1!=j)
                  list.add(nums[j]+"->"+nums[i-1]);
                else
                    list.add(Integer.toString(nums[j]));
                j=i;
            }
            if(i==len-1)
                if(nums[i]!=nums[i-1]+1)
                   list.add(Integer.toString(nums[i]));
                else
                    list.add((nums[j]+"->"+nums[i]));
        }
        return list;
        
    }
}