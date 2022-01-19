class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        List<Integer> res=new ArrayList<>();
        int i=digits.length-1;
        digits[len-1]=digits[len-1]+1;
       while(i>0)
       {
           if(digits[i]>9)
           {
               res.add(0,digits[i]-10);
               digits[i]=digits[i]-10;
               digits[i-1]=digits[i-1]+1;
           }
           else
               res.add(0,digits[i]);
           i--;
       }
        if(digits[0]>9)
        {
            res.add(0,digits[0]-10);
            res.add(0,1);
        }
        else
            res.add(0,digits[0]);
        
        return res.stream().mapToInt(k->k).toArray();
     
        
    }
}