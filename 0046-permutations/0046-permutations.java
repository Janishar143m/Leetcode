class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        permuteHelper(nums,list,result);
        return result;
        
        
        
    }
    
    private void permuteHelper(int[]nums,List<Integer>list,List<List<Integer>> result)
    {
        
        if(list.size()==nums.length)
            result.add(new ArrayList<>(list));
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(!list.contains(nums[i]))
                {
                    list.add(nums[i]);
                    permuteHelper(nums,list,result);
                    list.remove(list.size()-1);
                }
                
                
            }
        }
        
    }
}