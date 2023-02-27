class Solution {
    
    class Node
    {
        int val;
        int weight;
        
        Node(int val,int weight)
        {
            this.val=val;
            this.weight=weight;
        }
        public int getVal()
        {
            return this.val;
        }
        public int getWeight()
        {
            return this.weight;
        }
    }
    
    private int calculateDelay(int[][] adj,int[] weight,int k,int n)
    {
        PriorityQueue<Node> queue=new PriorityQueue<>((a,b)->a.getWeight()-b.getWeight());
        int[] visited=new int[n];
        Arrays.fill(visited,0);
        queue.offer(new Node(k-1,0));
        int result=0;
        int ct=0;
        while(!queue.isEmpty())
        {
            Node node=queue.poll();
            if(visited[node.getVal()]==1)
                continue;
            visited[node.getVal()]=1;
            ct++;
            result=Math.max(result,node.getWeight());
            for(int i=0;i<n;i++)
            {
                if(adj[node.getVal()][i]!=-1)
                {
                    weight[i]=Math.min(weight[i],node.getWeight()+adj[node.getVal()][i]);
                    queue.offer(new Node(i,weight[i]));
                }
            }
            
        }
        return ct==n?result:-1;
        
    }
    
    public int networkDelayTime(int[][] times, int n, int k) {
        
        int weight[]=new int[n];
        int[][] adj=new int[n][n];
        Arrays.fill(weight,Integer.MAX_VALUE);
        
        for(int i=0;i<n;i++)
            Arrays.fill(adj[i],-1);
        
        for(int i=0;i<times.length;i++)
        {
            adj[times[i][0]-1][times[i][1]-1]=times[i][2];
        }
        int delay=calculateDelay(adj,weight,k,n);
        return delay;
            
        
    }
}