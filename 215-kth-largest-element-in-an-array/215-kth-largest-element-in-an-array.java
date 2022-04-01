class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(i<k)
            {
                queue.offer(nums[i]);
            }
            else
            {
                if(queue.peek()<nums[i])
                {
                    queue.poll();
                    queue.offer(nums[i]);
                }
            }
        }
        return queue.peek();
        
    }
}