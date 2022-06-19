// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            printAns(ans);
        }
    }
    public static void printAns(ArrayList<Integer> ans) {
        for (Integer x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        ArrayList<Integer>result=new ArrayList<>();
        int start=0,end=0,prev=0;
        int maxStart=-1,maxEnd=-1;
        long maxSum=0;
         long sum=0;
        for(int i=0;i<n;i++)
        {
           
            if(a[i]>=0)
            {
                sum+=a[i];
                end=i;
                //end++;
                
            }
            else
            {
              
                if(sum>maxSum)
                {
                    maxSum=sum;
                    maxStart=start;
                    maxEnd=end;
                   
                }
                else if(sum==maxSum)
                {
                    if(end-start+1>maxEnd-maxStart+1)
                    {
                        maxSum=sum;
                        maxStart=start;
                        maxEnd=end;
                    }
                }
                sum=0;
                start=i+1;
                    
            }    
            
            
        }
        if(sum>maxSum)
                {
                    maxSum=sum;
                    maxStart=start;
                    maxEnd=end;
                   
                } 
        if(maxStart==-1)
           result.add(-1);
        else
        {
        for(int i=maxStart;i<=maxEnd;i++)
          result.add(a[i]);
        }  
       
         return result; 
            
        }
        // code here
    }