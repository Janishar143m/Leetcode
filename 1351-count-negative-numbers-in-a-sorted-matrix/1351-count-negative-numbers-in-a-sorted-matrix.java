class Solution {
    public int countNegatives(int[][] grid) {
        
        int r=grid.length-1,c=0,m=0,n=grid[0].length,count=0;
        while(r>=m && c<n)
        {
            if(grid[r][c]<0)
            {
                count+=n-c;
                r--;
            }
            else
                c++;
        }
        return count;
        
    }
}