// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        if(size==1)
         return a[0]; 
        
        int majority=a[0];
        int ct=0;
        final long maxCount;
        //final long element;
        for(int i=0;i<size;i++)
        {
            if(a[i]==majority)
             {
                 ct++;
                // maxCount=Math.max(maxCount,ct);
             }     
            else if(ct>1)
            ct--;
            else
            {
                majority=a[i];
                ct=1;
            }
        }
        final long max=majority;
       /*for(int i=0;i<size;i++)
        if(a[i]==majority)
          maxCount++;*/
       maxCount=Arrays.stream(a).filter(e->e==max).count();
      // System.out.println(maxCount);
       return (int)maxCount>size/2?majority:-1;
       //maxCount>(long)size/2?majority:-1;      
        
    }
}