// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            
            int[] A = new int[N];
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxDistance(A, N));
            
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    public int maxDistance(int[] A, int N) {
        
        int last=-1,res=0;
        for(int i=0;i<N;i++)
        {
            if(A[i]==1)
              {
                  res=(last==-1)?i:Math.max(res,(i-last)/2);
                  last=i;
              }      
        }
        res=Math.max(res,N-last-1);
        return res;
        
    }
};