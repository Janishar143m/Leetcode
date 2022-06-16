// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws IOException
    {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            int A[] = new int[N], B[] = new int[N];
            for(int i = 0; i < N; i++)
                A[i] = sc.nextInt();
            for(int i = 0; i < N; i++)
                B[i] = sc.nextInt();
            Solution ob = new Solution();
            int res = ob.minSwaps(N, A, B);
            out.println(res);
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int minSwaps(int N, int A[], int B[]){
        
        int c1=0,c2=0,c3=0,c4=0;
        int a=A[0],b=B[0];
        for(int i=0;i<N;i++)
        {
            if(c1!=Integer.MAX_VALUE)
            {
                if(A[i]==a)
                   {
                      
                   }
                else if(B[i]==a)
                 c1++;
                else
                  c1=Integer.MAX_VALUE;
            } 
             if(c2!=Integer.MAX_VALUE)
            {
                if(B[i]==a)
                   {
                       
                   }
                else if(A[i]==a)
                 c2++;
                else
                  c2=Integer.MAX_VALUE;
            } 
             if(c3!=Integer.MAX_VALUE)
            {
                if(A[i]==b)
                   {
                       
                   }
                else if(B[i]==b)
                 c3++;
                else
                  c3=Integer.MAX_VALUE;
            }
            if(c4!=Integer.MAX_VALUE)
            {
                if(B[i]==b)
                   {
                       
                   }
                else if(A[i]==b)
                 c4++;
                else
                  c4=Integer.MAX_VALUE;
            }
            
             
        }
        return (Math.min(Math.min(c1,c2),Math.min(c3,c4))==Integer.MAX_VALUE)?-1:Math.min(Math.min(c1,c2),Math.min(c3,c4));
        
    }
}