class Solution {
    public int trap(int[] height) {
        
        int rightMax[]=new int[height.length];
        int rightVal=0,leftVal=0,sum=0;
        for(int i=height.length-1;i>=0;i--)
        {
           rightVal=Math.max(rightVal,height[i]); 
           rightMax[i]=rightVal;
            
        }
        for(int i=0;i<height.length;i++)
        {
            leftVal=Math.max(leftVal,height[i]);
            sum+=Math.min(leftVal,rightMax[i])-height[i];
            
        }
        return sum;
        
        
    }
}