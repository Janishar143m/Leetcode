class Solution {
    public int reverse(int x) {
        
        long result=0;
        while(x!=0)
        {
            int rem=x%10;
            result=result*10+rem;
            x=x/10;
        }
        if(result>=Integer.MIN_VALUE && result<=Integer.MAX_VALUE)
            return (int)result;
        else
            return 0;
        
    }
}