class Solution {
    public int findLongestChain(int[][] pairs) {
        {
            Arrays.sort(pairs,(a,b)->a[1]-b[1]);
            int ct=1;
           // int dp[]=new int[pairs.length];
            int maximum;
           // for(int i=0;i<pairs.length;i++)
                 //dp[i]=1;
            maximum=pairs[0][1];
            for(int i=1;i<pairs.length;i++)
            {
               if(pairs[i][0]>maximum)
               {
                   maximum=pairs[i][1];
                   ct++;
               }
            } 
            return ct;
                
            
            
        }
        
        
        
    }
}