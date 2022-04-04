class Solution {
    public List<String> topKFrequent(String[] words, int k) {
         Map<String,Integer> map=new HashMap<>();
        Queue<String> queue=new PriorityQueue<>((a,b)->map.get(b)-map.get(a)==0?a.compareTo(b):map.get(b)-map.get(a));
       
        for(String s:words)
            map.put(s,map.getOrDefault(s,0)+1);
        for(Map.Entry entry:map.entrySet())
            queue.offer((String)entry.getKey());
        List<String> result=new ArrayList<>();
        for(int i=0;i<k;i++)
            result.add(queue.poll());
        return result;
        
    }
}