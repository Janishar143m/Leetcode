class Solution {
    public int missingNumber(int[] nums) {
        
        int[] ct=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            ct[nums[i]]++;
        }
        for(int i=0;i<ct.length;i++)
            if(ct[i]==0)
                return i;
        return -1;
        
    }
}