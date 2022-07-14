class Solution {
    public int maxArea(int[] height) {
        //int[]right=new int[height.length];
        int maxArea=Integer.MIN_VALUE;
        int start=0,end=height.length-1;
        while(start<end)
        {
            maxArea=Math.max(maxArea,Math.min(height[start],height[end])*(end-start));
            if(height[start]>height[end])
                end--;
            else 
                start++;
        }
        return maxArea;
        
    }
}