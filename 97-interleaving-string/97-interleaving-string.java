class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        char[] c3=s3.toCharArray();
        int m=s1.length();
        int n=s2.length();
        if(m+n!=s3.length())
            return false;  
        return dfs(c1,c2,c3,0,0,0,new boolean[m+1][n+1]);
    }
    public boolean dfs(char[] c1,char[] c2,char[] c3,int i,int j,int k,boolean[][]isInValid)
    {
        if(isInValid[i][j])
            return false;
        if(k==c3.length)
            return true;
        boolean valid=((i<c1.length && c1[i]==c3[k] && dfs(c1,c2,c3,i+1,j,k+1,isInValid))||(j<c2.length && c2[j]==c3[k] &&  dfs(c1,c2,c3,i,j+1,k+1,isInValid)) );
      if(!valid)  
        isInValid[i][j]=true;
        return valid;
    }
}