class Solution {
    public String frequencySort(String s) {
        Queue<Map.Entry<Character,Integer>> queue=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        Map<Character,Integer> map=new HashMap<>();
        for(Character c:s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        for(Map.Entry<Character,Integer> mp:map.entrySet())
            queue.offer(mp);
        StringBuilder sb=new StringBuilder();
        while(queue.size()>0)
        {
            Map.Entry<Character,Integer> mp=queue.poll();
            for(int i=0;i<mp.getValue();i++)
                sb.append(mp.getKey());
        }
        return sb.toString();
        
    }
}