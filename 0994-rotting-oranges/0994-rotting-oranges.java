class Solution {
    int count=0,fresh=0;
    Queue<int[]> queue=new LinkedList<>();
    public int orangesRotting(int[][] grid) 
    {
    
       for(int i=0;i<grid.length;i++)
           for(int j=0;j<grid[0].length;j++)
           {
                if(grid[i][j]==1)
                {
                    fresh++;
                }
               else if(grid[i][j]==2)
               {
                   queue.offer(new int[]{i,j});
               }
           }
         bfs(grid,grid.length,grid[0].length);
        
       
        
        
        return fresh==0?count:-1;
        
        
    }
    
    private void bfs(int[][]grid,int row,int col)
    {
       
        while(!queue.isEmpty() && fresh!=0)
        {
            
            count++;
            int size=queue.size();
            for(int n=0;n<size;n++)
            {
                int[] pair=queue.poll();
                 int i=pair[0];
                 int j=pair[1];
                
              
                
             
        if(i>0 && i<row && grid[i-1][j]==1)
        {
            fresh--;
            grid[i-1][j]=2;
            queue.add(new int[]{i-1,j});
        }   
        if(i>=0 && i<row-1 && grid[i+1][j]==1)
        {
            fresh--;
            grid[i+1][j]=2;
            queue.add(new int[]{i+1,j});
        }   
        if(j>0 && j<col && grid[i][j-1]==1)
        {
            fresh--;
            grid[i][j-1]=2;
            queue.add(new int[]{i,j-1});
            
        }
        if(j>=0 && j<col-1 && grid[i][j+1]==1)
        {
            fresh--;
            grid[i][j+1]=2;
            queue.add(new int[]{i,j+1});
        }
      
                }
            }     
            
            
           
            
            
        }
    
        
    }