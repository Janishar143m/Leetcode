class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> combinations=new ArrayList<>();
         List<List<Integer>> result=new ArrayList<>();
        findCombinations(candidates,0,target,list,combinations);
        //System.out.println("Result combinations size is:"+combinations.size());
        return combinations;
        
        
        
    }
    
    private void findCombinations(int[] candidates,int index,int target,List<Integer>list,List<List<Integer>> combinations)
    {
        if(target<0||index==candidates.length)
        {
            return;
        }
        else if(target==0)
        {
            
            if(!combinations.contains(list))
            {
                 combinations.add(new ArrayList<>(list));
            }    
        } 
        else
        {
        
            
        list.add(candidates[index]);
        //System.out.println(list);    
        findCombinations(candidates,index+1,target-candidates[index],list,combinations);
        findCombinations(candidates,index,target-candidates[index],list,combinations);
        list.remove(list.size()-1);
        findCombinations(candidates,index+1,target,list,combinations);
            
        }     
        
        
    }
    
}