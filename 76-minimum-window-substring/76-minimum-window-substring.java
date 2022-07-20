class Solution {
    public String minWindow(String s, String t) {
        
        if(s.length()<t.length())
            return "";
        int leftWindow=0,leftpos=0,minLen=Integer.MAX_VALUE,have=0,need=0;
        Map<Character,Integer> resultMap=new HashMap<>();
        Map<Character,Integer>windowMap=new HashMap<>();
        for(int i=0;i<t.length();i++)
            resultMap.put(t.charAt(i),resultMap.getOrDefault(t.charAt(i),0)+1);
        need=t.length();
        for(int rightWindow=0;rightWindow<s.length();rightWindow++)
        {
                           windowMap.put(s.charAt(rightWindow),windowMap.getOrDefault(s.charAt(rightWindow),0)+1);
            if(resultMap.containsKey(s.charAt(rightWindow)) && resultMap.get(s.charAt(rightWindow))>=windowMap.get(s.charAt(rightWindow)))
                have++;
            while(have==need)
            {
                if(rightWindow-leftWindow+1<minLen)
                {
                    leftpos=leftWindow;
                    minLen=rightWindow-leftWindow+1;
                }
               
                                         windowMap.put(s.charAt(leftWindow),windowMap.getOrDefault(s.charAt(leftWindow),0)-1);

                
                 if(resultMap.containsKey(s.charAt(leftWindow)) && resultMap.get(s.charAt(leftWindow))>windowMap.get(s.charAt(leftWindow)))
                have--;
                leftWindow++;
                
                
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(leftpos,leftpos+minLen);
        
    }
}