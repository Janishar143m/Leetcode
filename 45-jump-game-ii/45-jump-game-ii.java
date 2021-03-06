class Solution {
    public int jump(int[] nums) {
        
        int[] minSteps=new int[nums.length];
        //Arrays.fill(minSteps,100000000);
        minSteps[0]=0;
        for(int i=1;i<nums.length;i++)
        {
            minSteps[i]=100000000;
            for(int j=0;j<i;j++)
                if(nums[j]>=i-j)
                    minSteps[i]=Math.min(minSteps[i],1+minSteps[j]);
        }
        return minSteps[nums.length-1];
        
    }
}