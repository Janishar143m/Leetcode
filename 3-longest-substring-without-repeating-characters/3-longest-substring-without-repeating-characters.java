class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        int n=s.length();
        int startWindow=0,endWindow=0;
        Map<Character,Integer> map=new HashMap<>();
        //map.put(s.charAt(0),startWindow);
       int maxLength=1;
        for(endWindow=0;endWindow<n;endWindow++)
        {
            if(!map.containsKey(s.charAt(endWindow)))
            {
                map.put(s.charAt(endWindow),endWindow);
                
            }   
            else
            {
                if(map.get(s.charAt(endWindow))>=startWindow)
                     startWindow=map.get(s.charAt(endWindow))+1;
                map.put(s.charAt(endWindow),endWindow);
                //startWindow=map.get();    
            }
            maxLength=Math.max(maxLength,endWindow-startWindow+1);
            
        }
       // maxLength=Math.max(maxLength,endWindow-startWindow+1);
        return maxLength;
        
        
    }
}