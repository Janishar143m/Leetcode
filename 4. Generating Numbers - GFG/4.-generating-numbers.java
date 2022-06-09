// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.math.*;


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
    }

    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Long> v = ob.generateNumbers(N);
            for(long x : v)
                out.print(x + " ");
            out.print("\n");
        }
        out.flush();
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
   
    ArrayList<Long> generateNumbers(int N){
        //long i=1,ct=0;
        ArrayList<Long> result=new ArrayList<>();
        TreeSet<Long> set=new TreeSet<Long>();
        set.add(1L);
        for(int i=0;i<N;i++)
          {
              Long l=set.first();
              result.add(l);
              set.remove(l);
              set.add(l*2);
              set.add(l*3);
              set.add(l*5);
              set.add(l*7);
              
          }          
              
    return result;
              
           
        
    }
}