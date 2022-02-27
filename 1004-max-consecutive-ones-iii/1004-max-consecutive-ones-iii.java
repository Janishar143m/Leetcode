class Solution {
    public int longestOnes(int[] A, int K) {
       int start=0,length=0,zeroCount=0;
        for(int end=0;end<A.length;end++)
        {
            if(A[end]==0)
                zeroCount++;
            while(zeroCount>K)
            {
                if(A[start]==0)
                {
                    zeroCount--;
                }
                start++;
                   
                
            }
            length=Math.max(length,end-start+1);
        }
        return length;
    }
        
    
}