class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high=1,low=1;
        int mid=0,k=Integer.MAX_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            high=Math.max(high,piles[i]);
        }
        while(high>0 && low<=high)
        {
            int sum=0;
            mid=low+(high-low)/2;
            for(Integer p:piles)
             sum+=Math.ceil((double) p / mid);
            if(sum<=h)
            {
                
                 k=Math.min(k,mid);
                high=mid-1;
            }   
            else
                low=mid+1;
            
        }
        return k;
        
        
        
    }
}