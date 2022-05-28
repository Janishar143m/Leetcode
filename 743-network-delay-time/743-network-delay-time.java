class HeapEntry
    {
        private int weight;
        private int node;
        public int getWeight()
        {
            return weight;
        }
        public int getNode()
        {
            return node;
        }
    
       public HeapEntry(int weight,int node)
       {
           this.weight=weight;
           this.node=node;
       }
    }
class Solution {
    
    public int bfs(int adj[][],int weight[],Set<Integer>visited,int n,int k)
    {
        int result=0;
        HeapEntry entry;
        int ct=0;
        int minVal=0;
        List<Integer>list=new ArrayList<>();
        Queue<HeapEntry> queue=new PriorityQueue<>((a,b)->a.getWeight()-b.getWeight());
        queue.add(new HeapEntry(0,k));
        while(!queue.isEmpty())
        {
           
              entry=queue.poll();
            if(visited.contains(entry.getNode()))
                continue;
           visited.add(entry.getNode());
           result=Math.max(result,entry.getWeight());
            ct++;    
            for(int j=0;j<n;j++)
            {
               
                if(adj[entry.getNode()][j]!=-1)
                {
                     int newWeight=entry.getWeight()+adj[entry.getNode()][j];
                    queue.offer(new HeapEntry(newWeight,j));
                  
                   
                }
               
               
            }
            
                
        }
        if(ct==n)
            return result;
        else
            return -1;
    }
    
    public int networkDelayTime(int[][] times, int n, int k) {
        
       int adj[][]=new int[n][n];
        for(int i=0;i<adj.length;i++)
            Arrays.fill(adj[i],-1);
        int weight[]=new int[n];
        Set<Integer> visited=new HashSet<>();
        int result=0;
        Arrays.fill(weight,Integer.MAX_VALUE);
        weight[k-1]=0;
       for(int i=0;i<times.length;i++)
       {
           adj[times[i][0]-1][times[i][1]-1]=times[i][2];
       }
        result=bfs(adj,weight,visited,n,k-1);
        return result;
        
    }
}