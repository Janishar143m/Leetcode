class LRUCache {
    
    Map<Integer,Node>map;
    Node first;
    Node last;
    int MAX_CAPACITY;

    public LRUCache(int capacity) {
        map=new HashMap<>(capacity);
        first=new Node(-1,-1);
        last=new Node(-1,-1);
        MAX_CAPACITY=capacity;
        first.next=last;
        last.prev=first;
        
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
          // System.out.println("Before arrangement first node value is:"+first.next.val);
            //System.out.println("Before arrangement Last node value is:"+last.prev.val);
            

            remove(map.get(key));
            insert(map.get(key));
           //System.out.println("After arrangement first node value is:"+first.next.val);
           //System.out.println("After arrangement Last node value is:"+last.prev.val);
            //System.out.println("Get value is: "+map.get(key).val);
            return map.get(key).val;
            
        }
        else
            return -1;
        
    }
    
    public void put(int key, int value) {
        
       //System.out.println("Current size:"+map.size());
       if(map.size()>=MAX_CAPACITY && !map.containsKey(key))
       {
           //System.out.println("Removed key is:"+last.prev.key);
           map.remove(last.prev.key);
           remove(last.prev);

       }
        if(map.containsKey(key))
         remove(map.get(key));
        map.put(key,new Node(key,value));
        insert(map.get(key));
        //System.out.println("Map values are:"+map.toString());
                
        
    }
     
    private void insert(Node node)
    {
        Node after=first.next;
        first.next=node;
        node.next=after;
        node.prev=first;
        after.prev=node;
        
        
    }
    
    private void remove(Node node)
    {
        Node before=node.prev;
        Node after=node.next;
        before.next=after;
        after.prev=before;
        

        
    }
    
    class Node
    {
        int key;
        int val;
        Node prev;
        Node next;
        
        public Node(int key1,int val1)
        {
            key=key1;
            val=val1;
           
        }
 
            
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */