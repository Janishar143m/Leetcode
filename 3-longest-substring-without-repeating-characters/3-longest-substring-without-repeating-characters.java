class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int maxLength=0;
        int startWindow=0;
        int n=s.length();
        for(int endWindow=0;endWindow<n;endWindow++)
        {
            if(map.containsKey(s.charAt(endWindow)) && map.get(s.charAt(endWindow))+1>startWindow)
            {
                startWindow=map.get(s.charAt(endWindow))+1;
            }
            map.put(s.charAt(endWindow),endWindow);
            maxLength=Math.max(maxLength,endWindow-startWindow+1);
            
        }
        return maxLength;
        
    }
}