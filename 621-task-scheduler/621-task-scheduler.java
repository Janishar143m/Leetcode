class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        if(n==0)
            return tasks.length;
        int vals[]=new int[26];
        for(char C:tasks)
        {
            vals[C-'A']++;
        }
        Queue<Integer> pq=new PriorityQueue<Integer>((a,b)->(b-a));
        Queue<Pair<Integer,Integer>>q=new LinkedList<>();
        for(int i=0;i<26;i++)
            if(vals[i]>0)
                pq.add(vals[i]);
        int time=0;
        while(!pq.isEmpty()||!q.isEmpty())
        {
            time++;
           if(!pq.isEmpty())
           {
             int val=pq.poll();
             val--;
             
               if(val>0)
                   q.offer(new Pair(val,time+n));
           }
            if(!q.isEmpty() && q.peek().getValue()==time)
                pq.offer(q.poll().getKey());
           
        }
        return time;
    }
}