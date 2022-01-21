class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res={0,0};
        int calc=nums[0];
        for(int i=1;i<nums.length;i++)
            calc^=nums[i];
        
        calc&=-calc;
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i] & calc)==0)
                res[0]^=nums[i];
            else
                res[1]^=nums[i];
        }
        return res;
        
    }
}