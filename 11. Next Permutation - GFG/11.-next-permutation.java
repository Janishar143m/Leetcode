// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        int flag=0;
        int i=0;
        for(i=N-1;i>0;i--)
        {
            if(arr[i]>arr[i-1])
             {
                 flag=1;
                 break;
             }     
        }
        Integer[] input=new Integer[N];
        for(int l=0;l<N;l++)
         input[l]=arr[l];
        //System.out.println("Flag value is:"+flag);
        if(flag==0)
         Arrays.sort(input);
         else
         {
             int min=input[i-1];
             int nextMax=Integer.MAX_VALUE;
             int nextInd=i;
             for(int j=i;j<N;j++)
             {
                 if(input[j]>min && input[j]<nextMax)
                   {
                       nextMax=input[j];
                       nextInd=j;
                   }   
             }
             swap(input,i-1,nextInd);
             Arrays.sort(input,i,N);
             
         }
         return Arrays.asList(input);
         
        
        // code here
    }
    
    public static void swap(Integer arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}