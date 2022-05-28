class Solution {
    public int findParent(int i,int[]parent)
    {
        if(i==parent[i])
            return i;
        return findParent(parent[i],parent);
         
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int[] parent=new int[n+1];
        for(int i=0;i<=n;i++)
            parent[i]=i;
        
        
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            int p1=findParent(u,parent);
            int p2=findParent(v,parent);
            if(p1==p2)
                return edges[i];
            else
                parent[p2]=p1;
        }
        return new int[2];
            
        
        
    }
}