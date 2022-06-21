class Solution {
    public int trap(int[] height) {
        
        int leftMax[]=new int[height.length];
        //int rightMax[]=new int[height.length];
        int sum=0;
        //int leftheight=-1,rightheight=-1;
        leftMax[0]=height[0];
        int rightMax=Integer.MIN_VALUE;
        //rightMax[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++)
        {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        /*for(int i=height.length-2;i>=0;i--)
        {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }   */
        for(int i=height.length-1;i>=0;i--)
        {
            
            rightMax=Math.max(rightMax,height[i]);
            sum+=(Math.min(leftMax[i],rightMax)-height[i])*1;
        }
        
        return sum;
    }
}