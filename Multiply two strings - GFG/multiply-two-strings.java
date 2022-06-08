// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}// } Driver Code Ends


//User function Template for Java


//Initial Template for Java


// } Driver Code Ends


//User function Template for Java





//User function Template for Java

class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        StringBuilder result=new StringBuilder();
        StringBuilder negativeResult=new StringBuilder();
        boolean negativeNum1=false,negativeNum2=false;
        if(s1.equals("0")||s2.equals("0"))
          return "0";
        if(s1.charAt(0)=='-')
         {
             s1=s1.substring(1);
             negativeNum1=true;
         }
         if(s2.charAt(0)=='-')
         {
             s2=s2.substring(1);
             negativeNum2=true;
         }
        
        int len1=s1.length(),len2=s2.length(),mul=0,pos1=0,pos2=0,sum=0;
        int res[]=new int[len1+len2];
        for(int i=len1-1;i>=0;i--)
            for(int j=len2-1;j>=0;j--)
            {
               mul=(s1.charAt(i)-'0')*(s2.charAt(j)-'0');
                pos1=i+j;
                pos2=i+j+1;
                sum=mul+res[pos2];
                res[pos1]+=sum/10;
                res[pos2]=sum%10;
            }
        // StringBuilder result=new StringBuilder();
        
        for(int num:res)
            if(!(result.length()==0 && num==0))
                result.append(num);            
        if((negativeNum1 && !negativeNum2)||(negativeNum2 && !negativeNum1))
          {
              negativeResult.append("-");
              negativeResult.append(result);
              return negativeResult.toString();
              
          }
        //Integer finalResult=Integer.parseInt(result.toString());
        //result=new StringBuilder(Integer.toString(finalResult));
        return result.toString();
        
    }
}



//User function Template for Java

