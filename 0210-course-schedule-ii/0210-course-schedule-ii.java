class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        List<Integer> adj[]=new ArrayList[numCourses];
        List<Integer> result=new ArrayList<>();
        boolean[] dependent=new boolean[numCourses];
        Arrays.fill(dependent,false);
        int k=0;
        Queue<Integer> queue= new LinkedList<>();
        
        for(int i=0;i<numCourses;i++)
        {
            adj[i]=new ArrayList<>();
        }
        
        for(int [] arr:prerequisites)
        {
            adj[arr[0]].add(arr[1]);
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
            boolean isValid=true;
            for(Integer num:adj[index])
            {
                if(!result.contains(num))
                    isValid=false;
            }
            if(isValid)
            {
                if(!result.contains(index))
                {
                    result.add(index);
                }   
                 for(int[] num:prerequisites)
                {
                    if(num[1]==index)
                    {
                        queue.offer(num[0]);
                    }   
                }
            }   
           
              
            }
        if(result.size()<numCourses)
            result.clear();
        return result.stream().mapToInt(i->i).toArray();
        
    }
}