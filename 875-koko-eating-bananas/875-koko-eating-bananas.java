class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high=1,low=1;
        int k=0;
        for(int i=0;i<piles.length;i++)
        {
            high=Math.max(high,piles[i]);
        }
        while(high>0 && low<high)
        {
            int sum=0;
            k=low+(high-low)/2;
            for(Integer p:piles)
             sum+=Math.ceil((double) p / k);
            if(sum<=h)
            {
                high=k;
            }   
            else
                low=k+1;
            
        }
        return low;
        
        
        
    }
}