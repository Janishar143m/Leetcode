class Solution {
    PriorityQueue<Pair<int[],Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
            Set<Integer> visited=new HashSet<>();
        int[] parent;
       private int findParent(int index,int[] parent)
    {
        if(index==parent[index])
            return index;
        else
            return findParent(parent[index],parent);
    }
    
    private void calculate(int x,int[][] points)
    {
       
        for(int i=0;i<points.length;i++)
        {
            if(i!=x && (parent[i]!=parent[x]))
            {
                
                int[] s=new int[]{x,i};
                int dist=Math.abs(points[i][0]-points[x][0])+Math.abs(points[i][1]-points[x][1]);
                pq.offer(new Pair<>(s,dist));
            } 
                
        }
    }
    public int minCostConnectPoints(int[][] points) {
        
        int tot=0;
        int count=0;
        int cost=0;
        parent=new int[points.length];
         for(int i=0;i<points.length;i++)
            parent[i]=i;
                calculate(0,points);
        while(count!=points.length-1)
        {
            if(pq.isEmpty())
            {
                break;
            }
               Pair<int[],Integer> p = pq.poll();
               int[] val=p.getKey();
           int p1=findParent(val[0],parent);
            int p2=findParent(val[1],parent);
            if(p1==p2)
                continue;
            parent[p2]=p1;
            cost+=p.getValue();
            count++;
            calculate(val[1],points);
             
        }
        return cost;
        
        
        
    }
}