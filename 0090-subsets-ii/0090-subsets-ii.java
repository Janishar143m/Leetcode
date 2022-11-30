class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        subset(nums,0,list,result);
        return result;
        
    }
    private void subset(int[] nums,int idx,List<Integer> list,List<List<Integer>> result)
    {
        result.add(new ArrayList<>(list));
        for(int i=idx;i<nums.length;i++)
        {
            if(i>idx && nums[i]==nums[i-1])
                continue;
            list.add(nums[i]);
            subset(nums,i+1,list,result);
            list.remove(list.size()-1);
        }
    }
}