class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map=new HashMap<>();
        Queue<Map.Entry<Integer,Integer>> queue=new PriorityQueue<>((x,y)->y.getValue()-x.getValue());
        for(Integer num:nums)
            map.put(num,map.getOrDefault(num,0)+1);
        
        for(Map.Entry<Integer,Integer> mp:map.entrySet())
            queue.offer(mp);
        int[] result=new int[k];
        int j=0;
        for(int i=0;i<k;i++)
            result[j++]=queue.poll().getKey();
        return result;
        
    }
}