class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int[] maxProfit=new int[prices.length];
        for(int i=1;i<prices.length;i++)
        {
            maxProfit[i]=Math.max(0,maxProfit[i-1]+prices[i]-prices[i-1]);
            max=Math.max(max,maxProfit[i]);
        }
        return max;
            
        
        
    }
}