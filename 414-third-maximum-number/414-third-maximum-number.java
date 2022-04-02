class Solution {
    public int thirdMax(int[] nums) {
        int max=Integer.MIN_VALUE;
        Queue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        Arrays.stream(nums).filter(i->!queue.contains(i)).forEach(i->queue.offer(i));
        int length=queue.size();
        if(length>2)
        {
           queue.poll();
           queue.poll();
           max=queue.poll(); 
        }
        else
            max=queue.poll();
        return max;
        
    }
}