class Solution {
    public int maxProfit(int[] prices) {
        int maxTillNow=0;
        int maximumValue=0;
        for(int i=1;i<prices.length;i++)
        {
            maxTillNow=Math.max(0,maxTillNow+prices[i]-prices[i-1]);
            maximumValue=Math.max(maximumValue,maxTillNow);
        }
        return maximumValue;
        
        
        
    }
}