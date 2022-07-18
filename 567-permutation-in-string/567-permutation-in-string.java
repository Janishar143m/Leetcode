class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer>map1=new HashMap<>();
        int n1=s1.length();
        int n2=s2.length();
        for(int i=0;i<n1;i++)
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        for(int i=0;i<=n2-n1;i++)
        {
            boolean flag=false;
            Map<Character,Integer>map2=new HashMap<>();
            for(int j=i;j<i+n1;j++)
                map2.put(s2.charAt(j),map2.getOrDefault(s2.charAt(j),0)+1);
            
            if(map1.equals(map2))
                return true;
        }
        return false;
        
        
        
        
        
    }
}