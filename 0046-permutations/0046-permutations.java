class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        Boolean[] used=new Boolean[nums.length];
        Arrays.fill(used,false);
        permuteHelper(nums,list,result,used);
        return result;
        
        
        
    }
    
    private void permuteHelper(int[]nums,List<Integer>list,List<List<Integer>> result,Boolean[] used)
    {
        
        if(list.size()==nums.length)
            result.add(new ArrayList<>(list));
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(!used[i])
                {
                    list.add(nums[i]);
                    used[i]=true;
                    permuteHelper(nums,list,result,used);
                    list.remove(list.size()-1);
                    used[i]=false;
                }
                
                
            }
        }
        
    }
}