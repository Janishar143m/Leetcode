class Solution {
    public int compress(char[] chars) {
        int i=0,j=0,k=0;
        int len=chars.length;
         while(i<len)
         {
            while(j<len-1 && chars[j]==chars[j+1])
                 j++;
             if(j==len)
                 return k;
             int size=j-i+1;
             if(size>9)
             {
                  //i=j+1;
                  chars[k++]=chars[j];
                 String sizeStr=Integer.toString(size);
                 for(int l=0;l<sizeStr.length();l++)
                 {
                     //int rem=size%10;
                     chars[k++]=sizeStr.charAt(l);
                     //size=size/10;
                 }
                 //chars[k++]=(char)size;
                
                 
             }
            else if(size>1)
             {
                 chars[k++]=chars[j];
                 chars[k++]=(char)(size+48);
                 //i=j+1;
             }
             else
             {
                 chars[k++]=chars[j];
                 //i=j+1;
             }
             j++;
             i=j;
         }
        return k;
        
        
    }
}