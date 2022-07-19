class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length())
            return false;
        int n1=s1.length();
        int n2=s2.length();
        int[] charFreq1=new int[26];
        int[] charFreq2=new int[26];
        for(int i=0;i<n1;i++)
        {
            charFreq1[s1.charAt(i)-'a']++;
            charFreq2[s2.charAt(i)-'a']++;
            
        }
        if(Arrays.equals(charFreq1,charFreq2))
            return true;
        for(int i=n1;i<n2;i++)
        {
            charFreq2[s2.charAt(i)-'a']++;
            charFreq2[s2.charAt(i-n1)-'a']--;
            if(Arrays.equals(charFreq1,charFreq2))
             return true;

        }
        return false;
        
    }
}