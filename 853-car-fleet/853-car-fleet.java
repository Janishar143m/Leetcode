class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] info=new int[position.length][2];
        Stack<Double> stack=new Stack<>();
        for(int i=0;i<position.length;i++)
        {
            info[i][0]=position[i];
            info[i][1]=speed[i];
        }
        Arrays.sort(info,(a,b)->b[0]-a[0]);
        //for(int i=0;i<info.length;i++)
          //System.out.println(Arrays.toString(info[i]));
        for(int i=0;i<info.length;i++)
        {
            double currentTime=(double)(target-info[i][0])/info[i][1];
            if(stack.size()>0 && stack.peek()>=currentTime)
                continue;
            else
                stack.push(currentTime);
        }
        return stack.size();
        
        
    }
}