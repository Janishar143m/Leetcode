class KthLargest {
    PriorityQueue<Integer> queue=new PriorityQueue<>();
    int k;
    int[]nums;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.nums=nums;
        for(int i=0;i<nums.length;i++)
            add(nums[i]);
        
    }
    
    public int add(int val) {
        if(queue.size()<k)
        {
            queue.offer(val);
        }
        else if(queue.peek()<val)
        {
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */