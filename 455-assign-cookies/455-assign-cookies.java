class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
       Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,glen=g.length,sLen=s.length;
        while(i<glen && j<sLen)
        {
            if(g[i]<=s[j])
            {
                i++;
                j++;
            }  
            else
                j++;
        }
        return i;
        
    }
}