class Solution {
    public void rotate(int[][] matrix) {
        
        int lower=0;
        int upper=matrix.length-1;
        while(lower<upper)
        {
            int[] temp=matrix[lower];
            matrix[lower]=matrix[upper];
            matrix[upper]=temp;
            lower++;
            upper--;
        }
        for(int i=0;i<matrix.length;i++)
            for(int j=i;j<matrix[i].length;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        
    }
}