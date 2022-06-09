// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int A = Integer.parseInt(input_line[1]);
            int B = Integer.parseInt(input_line[2]);

            Solution ob = new Solution();
            long ans = ob.calculateSum(N, A, B); 
            System.out.println(ans);
        }
    } 
} // } Driver Code Ends


//User function Template for Java

//Initial Template for Java
 // } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    
    long sum(long N,long div)
    {
        long result=0L;
        //int ct=1;
        long n=N/div;
        result=(n*(2*div+(n-1)*div))/2;
        return result;
    }
    long GCD(long A,long B)
    {
        if(A==0)
          return B;
         else
           return GCD(B%A,A);
    }
    long LCM(long A,long B)
    {
      if(A==0||B==0)
       return 0;
       else if(A%2==0 && B%2==0 && (A%B==0 ||B%A==0))
        return A>B?A:B;
       else if(GCD(A,B)==1)
        return A*B;
      return A*B/GCD(A,B);
      
        
       
    }
    long calculateSum(int N,int A, int B) {
        long sumforA=sum(N,A);
        //System.out.println(sumforA);
        if(A!=B)
         {
             long sumforB=sum(N,B);
             //System.out.println(sumforB);
             long sumforC=sum(N,LCM(A,B));
             //System.out.println(sumforC);
             return sumforA+sumforB-sumforC;
         }     
        else
         return sumforA;
        // code here
    }
} 