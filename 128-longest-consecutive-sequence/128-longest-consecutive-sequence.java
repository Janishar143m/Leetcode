class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        int n=nums.length;
        int max_Len=0;
        if(n==1)
            return 1;
        for(int i=0;i<n;i++)
        {
          set.add(nums[i]);
        }
        for(Integer num:set)
        {
            int ct=1;
            int val=num;
           if(!set.contains(num-1))
           {
               while(set.contains(++val))
              {
                ct++;
               }   
            max_Len=Math.max(max_Len,ct); 
           }    
        }
         
        
            
        
        return max_Len;
        
    }
}