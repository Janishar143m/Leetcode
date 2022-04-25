class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean[] canReach=new boolean[n];
        canReach[0]=true;
        if(nums[0]>=n-1)
            return true;
        for(int i=1;i<n;i++)
        {
            canReach[i]=false;
           for(int j=0;j<i;j++)
            {
                if(nums[j]+j>=i && canReach[j])
                {
                    canReach[i]=true;
                    break;
                }    
            }
            if(canReach[i] && nums[i]+i>=n-1)
            {
                canReach[n-1]=true;
                break;
            }
                    
      }
      return canReach[n-1];  
        
    }
}