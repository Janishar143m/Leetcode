class Solution {
    
    private boolean dfs(int i,int[] visited,List<Integer>[] list)
    {
        visited[i]=1;
        for(Integer j:list[i])
        {
          if(visited[j]==0 && dfs(j,visited,list))
              return true;
            else if(visited[j]==1)
                return true;
        }
        visited[i]=2;
        return false;
        
    }
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        List<Integer> adj[]=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            adj[i]=new ArrayList<>();
        }
        for(int [] pair:prerequisites)
        {
            adj[pair[1]].add(pair[0]);
        }
        int[] visited=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(visited[i]==0 && dfs(i,visited,adj))
                return false;
        }
        return true;
        
    }
}