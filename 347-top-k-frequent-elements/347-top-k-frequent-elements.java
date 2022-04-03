class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer,Integer> map=new HashMap<>();
        Queue<Integer> queue=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
       
        for (Integer n:nums)
            map.put(n,map.getOrDefault(n,0)+1);
        for(Map.Entry<Integer,Integer> mp:map.entrySet())
            queue.offer(mp.getKey());
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            result.add(queue.poll());
        }
        return result.stream().mapToInt(i->i).toArray();
        
    }
}