class NumMatrix {

    Integer[][]mat;
    public NumMatrix(int[][] matrix) 
    {
        mat=new Integer[matrix.length][matrix[0].length];
     for(int i=0;i<matrix.length;i++)
     {
         int sum=0;
          for(int j=0;j<matrix[i].length;j++)
          {
              sum+=matrix[i][j];
              mat[i][j]=sum;
          }    
         
     }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
      
        for(int i=row1;i<=row2;i++)
        {
            if(col1>0)
                sum+=mat[i][col2]-mat[i][col1-1];
            else
                sum+=mat[i][col2];
            
        }  
           
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */