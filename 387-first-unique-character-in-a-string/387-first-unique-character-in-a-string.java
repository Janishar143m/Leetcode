class Solution {
    public int firstUniqChar(String s) {
        
        char[] input=s.toCharArray();
        char[]frequency=new char[26];
        for(int i=0;i<input.length;i++)
            frequency[input[i]-'a']++;
        for(int i=0;i<input.length;i++)            
            if(frequency[input[i]-'a']==1)
                return i;
        
            return -1;

    }
}