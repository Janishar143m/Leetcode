class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        Integer buy=null,sell=null,profit=0;
        for(int i=0;i<prices.length;i++)
        {
            while(i<n-1 && prices[i]>=prices[i+1])
                i++;
            buy=prices[i];
            if(i==n)
                break;
            while(i<n-1 && prices[i]<=prices[i+1])
                i++;
            sell=prices[i];
            if(buy!=null && sell!=null)
              profit+=sell-buy;
            
            
        }
        return profit;
        
    }
}