class Solution {
    public int lengthOfLIS(int[] nums) {
        int maxValue=1;
        int[] subSeq=new int[nums.length];
        subSeq[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            int max=0;
            for(int j=0;j<i;j++)
            {
              if(nums[j]<nums[i])  
                max=Math.max(subSeq[j],max);   
            }  
               
            subSeq[i]=1+max;
            maxValue=Math.max(maxValue,subSeq[i]);
        }
        return maxValue;
            
        
        
    }
}