class Solution {
    public boolean canJump(int[] nums) {
        
        boolean[] canReach=new boolean[nums.length];
        canReach[0]=true;
        for(int i=1;i<nums.length;i++)
        {
            canReach[i]=false;
           for(int j=0;j<i;j++)
            {
                if(nums[j]+j>=i && canReach[j]==true)
                {
                    canReach[i]=true;
                    break;
                }    
            } 
                    
      }
      return canReach[nums.length-1];  
        
    }
}