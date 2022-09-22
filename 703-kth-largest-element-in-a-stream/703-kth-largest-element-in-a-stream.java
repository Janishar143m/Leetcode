class KthLargest {
    
    Queue<Integer> queue=new PriorityQueue<>((a,b)->a-b);
    int size;

    public KthLargest(int k, int[] nums) {
        
        size=k;
       for(Integer i:nums) 
         add(i);
        
        
    }
    
    public int add(int val) {
        
        //System.out.println(queue.toString());
        
        if(queue.size()>=size && val>=queue.peek())
        {
            queue.poll();
            queue.offer(val);
        }
        else if(queue.size()<size)
            queue.offer(val);
        return queue.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */