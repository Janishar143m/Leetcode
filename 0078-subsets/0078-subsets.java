class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        subsetsUtil(nums,0,list);
        return list;
        
    }
    
    private void subsetsUtil(int[]nums,int index,List<List<Integer>> list)
    {
        if(index>=nums.length)
            return;
        int size=list.size();
        for (int i=0;i<size;i++)
        {
            List<Integer> newList=new ArrayList<Integer>(list.get(i));
            newList.add(nums[index]);
            list.add(newList);
        }
        subsetsUtil(nums,index+1,list);
        
    }
}