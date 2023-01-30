class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        List<Integer> adj[]=new ArrayList[numCourses];
        List<Integer> next[]=new ArrayList[numCourses];
        List<Integer> result=new ArrayList<>();
        int k=0;
        boolean flag=false;
        Queue<Integer> queue= new LinkedList<>();
        
        for(int i=0;i<numCourses;i++)
        {
            adj[i]=new ArrayList<>();
             next[i]=new ArrayList<>();
        }
        
        for(int [] arr:prerequisites)
        {
            adj[arr[0]].add(arr[1]);
            next[arr[1]].add(arr[0]);
        }
        
           for(int i=0;i<numCourses;i++)
        {
            if((adj[i].size()==0))
            {
               
                queue.offer(i);
            }   
               
        }
        while(!queue.isEmpty() && result.size()<numCourses)
        {
                int index=queue.poll();
                if(!result.contains(index))
                {
                    result.add(index);
                }
                for(Integer i:next[index])
                {  
                    flag=true;
                    for(Integer n:adj[i])
                    {
                        if(!result.contains(n))
                        {
                            flag=false;
                        }
                    }
                    if(flag)
                        queue.offer(i);
                }    
            }
        if(result.size()<numCourses)
            result.clear();
        return result.stream().mapToInt(i->i).toArray();
        
    }
}