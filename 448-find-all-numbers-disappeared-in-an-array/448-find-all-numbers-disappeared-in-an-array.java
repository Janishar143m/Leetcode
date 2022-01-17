class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<>();
        int len=nums.length;
        int [] cnt=new int[len];
        for(int i=0;i<nums.length;i++)
            cnt[nums[i]-1]++;
         for(int i=0;i<len;i++)
             if(cnt[i]==0)
                 result.add(i+1);
        return result;
        
    }
}