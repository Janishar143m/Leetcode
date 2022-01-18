class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ct=0;
        int len=flowerbed.length;
        for(int i=0;i<flowerbed.length;i=i+1)
        {
            if(i==0)
            {
                if(flowerbed[i]==0 && len>=2 && flowerbed[i+1]==0)
                {
                  flowerbed[i]=1;
                    ct++;
                }   
                else if(flowerbed[i]==0 && len==1)
                {
                    flowerbed[i]=1;
                    ct++;
                }   
            }   
            else if(i==len-1)
            {
                if (flowerbed[i]==0 && flowerbed[i-1]==0)
                {
                    flowerbed[i]=1;
                    ct++;
                }   
            }   
            else if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
            {
                flowerbed[i]=1;
                ct++;
            }      
       
        
    }
         if(ct>=n)
            return true;
        else
            return false;
}
}    