class Solution {
    public int lastStoneWeight(int[] stones) {
        
        Queue<Integer> queue= new PriorityQueue<>(Collections.reverseOrder());
        Arrays.stream(stones).forEach(i->queue.offer(i));
        int wt1=-1,wt2=-1;
        while(queue.size()>1)
        {
            wt1=queue.poll();
            wt2=queue.poll();
            //System.out.println(wt1);
            //System.out.println(wt2);
            if(wt1>=wt2)
                queue.offer(wt1-wt2);
            
        }
        return queue.peek();
        
    }
}