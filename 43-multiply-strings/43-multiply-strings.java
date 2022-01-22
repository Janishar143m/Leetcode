class Solution {
    public String multiply(String num1, String num2) {
        
        int len1=num1.length(),len2=num2.length(),mul=0,pos1=0,pos2=0,sum=0;
        int res[]=new int[len1+len2];
        for(int i=len1-1;i>=0;i--)
            for(int j=len2-1;j>=0;j--)
            {
               mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                pos1=i+j;
                pos2=i+j+1;
                sum=mul+res[pos2];
                res[pos1]+=sum/10;
                res[pos2]=sum%10;
            }
        StringBuilder result=new StringBuilder();
        
        for(int num:res)
            if(!(result.length()==0 && num==0))
                result.append(num);
                
         return result.length()==0?"0":result.toString();       
          
        
        
    }
}