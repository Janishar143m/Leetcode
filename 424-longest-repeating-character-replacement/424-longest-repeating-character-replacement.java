class Solution {
    public int characterReplacement(String s, int k) {
       int n=s.length();
        int[] charFreq=new int[26];
       int left=0;
        int maxFreq=0,maxLen=0;
        for(int right=0;right<n;right++)
        {
            charFreq[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,charFreq[s.charAt(right)-'A']);
            if(right-left+1-maxFreq>k)
            {
                charFreq[s.charAt(left)-'A']--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            
        }
        return maxLen;
        
    }
}