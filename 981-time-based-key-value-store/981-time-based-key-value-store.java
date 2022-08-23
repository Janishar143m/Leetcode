class TimeMap {
    
    Map<String,List<Pair<Integer,String>>> map;

    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        
       if(!map.containsKey(key))
            map.put(key,new ArrayList<>());
        
        map.get(key).add(new Pair<Integer,String>(timestamp,value));
          
        
        
    }
    
    public String get(String key, int timestamp) {
           if(!map.containsKey(key))
               return "";
           else
               return getValueTimestamp(key,timestamp);
               
        
    }
    private String getValueTimestamp(String key, int timestamp)
    {
        List<Pair<Integer,String>> list=map.get(key);
        int low=0;
        int high=list.size()-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if((mid==list.size()-1 && list.get(mid).getKey()<=timestamp)||(list.get(mid).getKey()<=timestamp && list.get(mid+1).getKey()>timestamp))
                return list.get(mid).getValue();
            else if(list.get(mid).getKey()<timestamp)
                low=mid+1;
            else
                high=mid-1;
            
        }
        return "";
        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */