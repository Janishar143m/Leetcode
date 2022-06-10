class Solution {
    public int subsetSum(int nums[])
    {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        int sum=0;
        //result.add(new ArrayList<>());
       for(int i=0;i<nums.length;i++)
       {
           List<List<Integer>> current=new ArrayList<>();
           for(List<Integer> list:result)
               current.add(new ArrayList<>(list));
          // System.out.println("Current list size:"+current.size());
           for(List<Integer> list:current)
           {
               //System.out.println("List is:"+list.toString());
               list.add(nums[i]);
                //System.out.println("Result list before adding to result:"+result.toString());
                result.add(new ArrayList<>(list)); 
               //System.out.println("Listafter number addition is:"+result.toString());
               //result.add(new ArrayList<>(list));
           }
               
            
           //System.out.println("result list after adding is:"+result.toString());
              
           
       }
        for(List<Integer>list:result)
        {
            //System.out.println(list.toString());
            sum+=list.stream().reduce(0,(a,b)->a^b);
        }   
        return sum;
    }
    public int subsetXORSum(int[] nums) {
        int sum=0;
        sum=subsetSum(nums);
        return sum;
        
    }
}