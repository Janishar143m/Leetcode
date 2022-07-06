class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        if(strs.length==0)
            return new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] ch=new char[26];
            for(char c:strs[i].toCharArray())
                ch[c-'a']++;
            String s=new String(ch);
            map.computeIfAbsent(s,k->new ArrayList<>());
            map.get(s).add(strs[i]);
            
            
            
        }
        result.addAll(map.values());
        return result;
        
        
        
    }
}