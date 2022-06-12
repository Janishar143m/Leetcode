// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine();
            String[] S = s.split(" ");
            long x = Long.parseLong(S[0]);
            long n = Long.parseLong(S[1]);
            long m = Long.parseLong(S[2]);
            Solution ob = new Solution();
            long ans = ob.PowMod(x, n, m);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long result=1L;
    public long PowMod(long x, long n, long m)
    {
        // Code here
        //if(m==0)
         // throw new Exception("")
         x=x%m;
        while(n>0)
          {
              if(n%2!=0)
               result=(result*x)%m;
              n=n/2;
              x=(x*x)%m;
          }      
         return result;
          
    }
}