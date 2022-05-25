class Solution {
       public boolean dfs(int i,List<Integer>adj[],int[] visited,List<Integer>s)
    {
        visited[i]=1;
        for(Integer j:adj[i])
        {
            if (visited[j]==1)
                return true;
            if(visited[j]==0 && dfs(j,adj,visited,s))
                return true;
        }
        visited[i]=2;
        s.add(i);   
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         
        List<Integer> adj[]=new ArrayList[numCourses];
        List<Integer> s=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
            adj[i]=new ArrayList<Integer>();
        for(int []course:prerequisites)
            adj[course[1]].add(course[0]);
        int[] visited=new int[numCourses];
        for(int i=0;i<numCourses;i++)
            if(visited[i]==0 && dfs(i,adj,visited,s))
                return new int[0];
        Collections.reverse(s);
        return s.stream().mapToInt(i->i).toArray();
        
        
    }
}

