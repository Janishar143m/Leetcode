class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        
        Map<String,Integer> map=new HashMap<>();
        String cellStr=Arrays.toString(cells);
        for(int i=0;i<n;i++)
        {
            map.put(cellStr,i);
            cells=nextDay(cells);
            cellStr=Arrays.toString(cells);
            if(map.containsKey(cellStr))
            {
                int prevLoc=map.get(cellStr);
                int freq=i-prevLoc+1;
                int remLoc=n-(i+1);
                return afterNDays(cells,remLoc%freq);
            }
        }
        return cells;
        
    }
    
    private int[] afterNDays(int[]cells,int N)
    {
        for(int i=0;i<N;i++)
        {
            cells=nextDay(cells);
        }
        return cells;
    }
    
    private int[] nextDay(int[] cells)
    {
        int[] newCells=new int[8];
        for(int i=1;i<7;i++)
        {
            if(cells[i-1]==cells[i+1])
                newCells[i]=1;
            else
                newCells[i]=0;
        }
        return newCells;
    }
    
    
            
}