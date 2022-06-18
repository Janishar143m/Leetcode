// { Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[n];
            
            for(int i=0; i<n; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.repeatNum(arr,n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int repeatNum(int[] arr , int n) {
        int count1=0,count2=0;
        int first=-1,second=-1;
        for(int i=0;i<n;i++)
        {
            if(first==arr[i])
             count1++;
             else if(second==arr[i])
             count2++;
             else if(count1==0)
             {
                 first=arr[i];
                 count1++;
             }
             else if(count2==0)
             {
                 second=arr[i];
                 count2++;
             }
             else
             {
                 count1--;
                 count2--;
             }
        }
        count1=0;
        count2=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==first)
             count1++;
            else if(arr[i]==second)
             count2++;
            
            
             
        }
        if(count1>n/3 && count2>n/3)
              return Math.min(first,second);
        else if(count1>n/3)
          return first;
         if(count2>n/3)
          return second;
         else
           return -1;
        // code here
    }
};