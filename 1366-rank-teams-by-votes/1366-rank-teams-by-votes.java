class Solution {
    public String rankTeams(String[] votes) {
        Map<Character,int[]>map=new HashMap<>();
        int len=votes[0].length();
        for(String s:votes)
            for(int i =0;i<len;i++)
            {
                Character c=s.charAt(i);
                map.putIfAbsent(c,new int[len]);
                map.get(c)[i]++;
            }
        List<Character> charList=new ArrayList<>(map.keySet());
        Collections.sort(charList,(a,b)->
                         {
                             for (int i=0;i<len;i++)
                         {
                            if(map.get(a)[i]!=map.get(b)[i])
                              return (map.get(b)[i]-map.get(a)[i]); 
                         }
                        return a-b;
                        }); 
        return charList.stream().map(String::valueOf)
                            .collect(Collectors.joining());
    }
}   
