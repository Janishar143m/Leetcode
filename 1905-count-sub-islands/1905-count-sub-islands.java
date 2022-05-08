class Pair
{
    int row;
    int col;
    
    Pair(int i,int j)
    {
        row=i;
        col=j;
    }
}
class Solution {
    List<Pair> list1;
    int r=0,c=0;
    public void dfs(int[][]grid,int i,int j)
    {
        if(i<0||j<0||i>=r||j>=c||grid[i][j]!=1)
            return;
        grid[i][j]=0;
        list1.add(new Pair(i,j));
       
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        
        r=grid1.length;
        c=grid1[0].length;
        int ct=0;
        
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
            {
               if(grid2[i][j]==1)
               {
                list1=new ArrayList<>();
                //dfs(grid1,i,j,0);
                dfs(grid2,i,j);
                //System.out.println(list1);
                //System.out.println(list1);
                int flag=0;  
                for(Pair s:list1)   
                {
                    int x=s.row;
                    int y=s.col;
                    if(grid1[x][y]!=1)
                    {
                        flag=1;
                        break;
                    }
                    
                }
                 if(flag==0)
                     ct++;
                    
               }    
             
            }
        return ct;
        
        
        
        
    }
}