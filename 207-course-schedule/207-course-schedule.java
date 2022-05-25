class Solution {
    
    public boolean dfs(int i,List<Integer>adj[],int[] visited)
    {
        visited[i]=1;
        for(Integer j:adj[i])
        {
            if (visited[j]==1)
                return true;
            if(visited[j]==0 && dfs(j,adj,visited))
                return true;
        }
        visited[i]=2;
        return false;
    }
    
    
    public boolean canFinish(int numCourses, int[][] prerequisites) 
    {
        List<Integer> adj[]=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++)
            adj[i]=new ArrayList<Integer>();
        for(int []course:prerequisites)
            adj[course[1]].add(course[0]);
        int[] visited=new int[numCourses];
        for(int i=0;i<numCourses;i++)
            if(visited[i]==0 && dfs(i,adj,visited))
                return false;
        return true;
        
    }
}