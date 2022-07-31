class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int ct=0;
        int res[]=new int[nums.length-k+1];
        Deque<Integer> deque=new LinkedList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!deque.isEmpty() && deque.peekFirst()<i-k+1)
                deque.pollFirst();
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i])
                deque.pollLast();
            deque.offer(i);
            if(i>=k-1)
                res[ct++]=nums[deque.peekFirst()];
            
        }
        
        return res;
        
    }
}