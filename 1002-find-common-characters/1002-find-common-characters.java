class Solution {
    public List<String> commonChars(String[] words) {
        
        List<String>result=new ArrayList<>();
        int[] count=new int[26];
        Arrays.fill(count,Integer.MAX_VALUE);
        for (String s:words)
        {
            int[] cnt=new int[26];
            s.chars().forEach(c->++cnt[c-'a']);
            for(int i=0;i<26;i++)
                count[i]=Math.min(cnt[i],count[i]);
        }
        for(char c='a';c<='z';c++)
            while(count[c-'a']-->0)
                result.add(""+c);
        
        return result;
    }
}