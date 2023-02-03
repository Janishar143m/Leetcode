class Solution {
    
    private int findParent(int index,int[] parent)
    {
        if(index==parent[index])
            return index;
        else
            return findParent(parent[index],parent);
    }
    
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int[] parent=new int[n+1];
        for(int i=0;i<=n;i++)
            parent[i]=i;
        
        for(int[] edge:edges)
        {
            int x=edge[0];
            int y=edge[1];
            int p1=findParent(x,parent);
            int p2=findParent(y,parent);
            if(p1==p2)
                return edge;
            else
                parent[p2]=p1;
        }
        return new int[2];
        
    }
}