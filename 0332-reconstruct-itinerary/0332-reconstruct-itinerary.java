class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        
        Map<String,PriorityQueue<String>> map=new HashMap<>();
        PriorityQueue<String> queue=null;
        List<String> result=new ArrayList<>();
        int noOfTickets=0;
        for(List<String> list:tickets)
        {
            queue=map.getOrDefault(list.get(0),new PriorityQueue<String>());
            queue.offer(list.get(1));
            map.put(list.get(0),queue);
            noOfTickets++;
            
        }
    //System.out.println(map.toString());  
    result=findPath(map,"JFK",result,noOfTickets);
       
     return result;
        
        
    }
    
    private List<String> findPath(Map<String,PriorityQueue<String>> map,String currentNode,List<String> result,int noOfTickets)
    {
        
          Stack<String> stack=new Stack<>();
          stack.push(currentNode);
          while(!stack.isEmpty())
          {
              String s=stack.peek();
              PriorityQueue<String> queue=map.getOrDefault(s,new PriorityQueue<String>());
              if(queue.size()==0)
                  result.add(0,stack.pop());
              else
              {
                  String adj=queue.poll();
                  stack.push(adj);
              }
          }
        if(result.size()==noOfTickets+1)
        {
            return result;
        }   
        else
            return Collections.emptyList();
    
        
    }
    
    
}