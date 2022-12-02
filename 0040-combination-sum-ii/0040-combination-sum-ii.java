class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        findSum(candidates,0,target,list,result,0);
        return result;
        
        
    }
    private void findSum(int[] candidates,int idx,int target,List<Integer> list,List<List<Integer>> result,int sum)
    {
        if(sum==target)
        {
            result.add(new ArrayList<>(list));
        }
        if(sum>target)
            return;
       for(int i=idx;i<candidates.length;i++)
       {
           if(i>idx && candidates[i]==candidates[i-1])
            continue;
           if(sum+candidates[i]<=target)
           {
               sum+=candidates[i];
               list.add(candidates[i]);
               findSum(candidates,i+1,target,list,result,sum);
               list.remove(list.size()-1);
               sum-=candidates[i];    
           }
        
      }
}
}