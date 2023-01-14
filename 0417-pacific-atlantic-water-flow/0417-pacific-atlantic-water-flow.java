class Solution {
    boolean atlantic;
    boolean pacific;
    public List<List<Integer>> pacificAtlantic(int[][] heights) 
    {
       List<List<Integer>> result=new ArrayList<>();
        int row=heights.length;
        int col=heights[0].length;
        Set<String> set;
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
            {
                pacific=false;
                atlantic=false;
                set=new HashSet<>();
                checkCell(i,j,row,col,heights,Integer.MAX_VALUE,set);
                //System.out.println("Row:"+i+" Column:"+j);
                //System.out.println("Path is:"+set);    
                if(atlantic && pacific)
                {
                    result.add(Arrays.asList(i,j));
                }
            }
        return result;
        
        
    }
    
    private void checkCell(int i,int j,int row,int col,int[][]heights,int prev_value,Set<String> traversed)
    {
        if(i<0||i>=row||j<0||j>=col||heights[i][j]>prev_value||(pacific && atlantic)||traversed.contains(i+" "+j))
        {
            return;
        }
        if(i==0||j==0)
        {
            pacific=true;
            
        }
        if(i==row-1 || j==col-1)
        {
            atlantic=true;
        }
        traversed.add(i+" "+j);
        if(atlantic && pacific)
        {
            return;
        }   
        checkCell(i-1,j,row,col,heights,heights[i][j],traversed);
        checkCell(i+1,j,row,col,heights,heights[i][j],traversed);
        checkCell(i,j-1,row,col,heights,heights[i][j],traversed);
        checkCell(i,j+1,row,col,heights,heights[i][j],traversed);
        
    }
}