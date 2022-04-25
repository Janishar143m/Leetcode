class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int noOfSteps=0;
        if(n<2)
            return true;
        for(int pos=n-2;pos>=0;pos--)
        {
            if(nums[pos]==0)
            {
                noOfSteps=1;
                while(noOfSteps>nums[pos])
                {
                    noOfSteps++;
                    pos--;
                    if(pos<0)
                        return false;
                }
            }
        }
        return true;
        
        
    }
}