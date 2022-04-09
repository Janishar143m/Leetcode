class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        boolean result=true;
        Arrays.sort(trips,(a,b)->(a[1]-b[1]));
       PriorityQueue<int[]>queue=new PriorityQueue<>((a,b)->a[2]-b[2]);
        //queue.offer(trips[0]);
        //capacity=capacity-trips[0][0];
        for(int i=0;i<trips.length;i++)
        {
          
            
            while(queue.peek()!=null && queue.peek()[2]<=trips[i][1])
            {
                capacity=capacity+queue.peek()[0];
                queue.poll();
            }
             if((queue.peek()==null ||(queue.peek()!=null && queue.peek()[2]>trips[i][1])) && capacity>=trips[i][0])
            {
                queue.offer(trips[i]);
                capacity=capacity-trips[i][0];
            }   
            
            else
            {
                result=false;
                break;
            }   
        }
        return result;
                
        
    }
}