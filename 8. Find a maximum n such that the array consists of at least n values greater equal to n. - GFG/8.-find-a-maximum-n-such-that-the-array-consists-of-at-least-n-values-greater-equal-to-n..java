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
            System.out.println(ob.maxValueK(A));
            
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    public int maxValueK(int A[]) {
        
        int n=A.length;
        int sum=0;
        int[] freq=new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(A[i]<n)
             freq[A[i]]++;
             else
             freq[n]++;
            
        }
        for(int i=n;i>0;i--)
         {
             sum+=freq[i];
             if(sum>=i)
               return i;
         }
         return 0;
        
        
    }
}