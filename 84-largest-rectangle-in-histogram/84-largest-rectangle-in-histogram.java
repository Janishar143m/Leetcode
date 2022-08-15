class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int [] left=new int[heights.length];
        int result=Integer.MIN_VALUE;
        for(int i=heights.length-1;i>=0;i--)
        {
           
           while (!stack.isEmpty() && heights[stack.peek()]>heights[i])
               left[stack.pop()]=i+1;
            stack.push(i);
               
                    
        }
          for(int i=0;i<heights.length;i++)
            if(left[i]==0)
                left[i]=0;
        stack.clear();
        int[] right=new int[heights.length];
        stack.push(0);
        Arrays.fill(right,-1);
        for(int i=1;i<heights.length;i++)
        {
            while (!stack.isEmpty() && heights[stack.peek()]>heights[i])
               right[stack.pop()]=i-1;
             stack.push(i);
        }
        for(int i=0;i<heights.length;i++)
            if(right[i]==-1)
                right[i]=heights.length-1;
        for(int i=0;i<heights.length;i++)
        {
            result=Math.max(result,(right[i]-left[i]+1)*heights[i]);
        }
        //System.out.println(Arrays.toString(left));
        //System.out.println(Arrays.toString(right));
        
        return result;    
        
        
    }
}