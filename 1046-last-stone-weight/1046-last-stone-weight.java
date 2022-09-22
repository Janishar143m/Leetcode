class Solution {
    Queue<Integer> queue=new PriorityQueue<>((a,b)->b-a);
    public int lastStoneWeight(int[] stones) {
        
        for(Integer num:stones)
            queue.offer(num);
        while(queue.size()>1)
        {
            int wt1=queue.poll();
            int wt2=queue.poll();
            if(wt1!=wt2)
                queue.offer(wt1-wt2);
        }
        return queue.isEmpty()?0:queue.peek();
        
    }
}