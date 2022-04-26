class Solution {
    public int jump(int[] nums) {
        
        int[] minSteps=new int[nums.length];
        //Arrays.fill(minSteps,100000000);
        minSteps[0]=0;
        if(nums.length==1)
            return 0;
        if(nums[0]>=nums.length-1)
            return 1;
        for(int i=1;i<nums.length;i++)
        {
            minSteps[i]=100000000;
            for(int j=0;j<i;j++)
                if(nums[j]>=i-j && minSteps[j]!=100000000 )
                    minSteps[i]=Math.min(minSteps[i],1+minSteps[j]);
        }
        return minSteps[nums.length-1];
        
    }
}