// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            
            String input_line[] = read.readLine().trim().split("\\s+");
            int a[]= new int[n];
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            int vec[] = ob.printMissingIntervals(a, n);
            
            for(int i=0 ; i<vec.length ; i+=2)
            {
                if (vec[i]==vec[i+1])
                    System.out.print(vec[i]);
                else
                {
                    System.out.print(vec[i]);
                    System.out.print("-");
                    System.out.print(vec[i+1]);
                }
                if(i!=vec.length-2)
                    System.out.print(",");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[] printMissingIntervals(int[] a , int n){
        // your code should return an Array if you are Coding in JAVA!
        List<int[]> result=new ArrayList<>();
        int ct=0;
        if(a[0]>0 && a[0]<2)
         result.add(new int[]{a[0]-1});
        else if(a[0]>1)
         result.add(new int[]{0,a[0]-1});
         for(int i=1;i<n;i++)
         {
             if(a[i]-a[i-1]==2)
               {
                   result.add(new int[]{a[i]-1});
                   //ct++;
               }  
             else if(a[i]-a[i-1]>2)
               {
                   result.add(new int[]{a[i-1]+1,a[i]-1});
                   //ct+=2;
               }   
         }
         if(a[n-1]<99999)
          {
              if(99999-a[n-1]==1)
               {
                   result.add(new int[]{99999});
                   //ct++;
               }   
               else
               {
                result.add(new int[]{a[n-1]+1,99999});
                //ct=ct+2;
               }
          }
          
          int[] final1=new int[result.size()*2];
          int i=0;
          for(int[] arr:result)
            {
                if(arr.length==1)
                  {
                      final1[i++]=arr[0];
                      final1[i++]=arr[0];
                  }      
                 else
                  {
                       final1[i++]=arr[0];
                       final1[i++]=arr[1];
                  }
            }      
         
         return final1;        
          
        
    }
};