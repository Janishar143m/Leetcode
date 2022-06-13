// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0 ; i<N ; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<Integer> res = ob.increment(arr,N);
            
            for(int i=0; i<res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        // code here
        ArrayList<Integer>result=new ArrayList<>(N+1);
        
        Integer carry=0;
        int pos=arr.size()-1;
        int newDigit=arr.get(pos)+1;
        
            arr.set(pos,newDigit%10);
            //System.out.println(arr.toString());
            carry=newDigit/10;
 
        if(carry>0)
        {
            for(int i=pos-1;i>=0;i--)
        {
            int dig=arr.get(i)+carry;
            {
            carry=dig/10;
            dig=dig%10;
            arr.set(i,dig);
            }
        }
        }
        if (carry>0)
        {
            result.add(carry);
            for(Integer n:arr)
              result.add(n);
             return result; 
        }
         //arr.add(0,carry);
        return arr; 
        
    }
};