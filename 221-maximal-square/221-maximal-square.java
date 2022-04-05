class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int max=-1;
        int sum[][]=new int[m+1][n+1];
        for(int i=0;i<n;i++)
        {
            sum[0][i]=Character.getNumericValue(matrix[0][i]);
            max=Math.max(max,sum[0][i]);
        }   
        for(int i=0;i<m;i++)
        {
            sum[i][0]=Character.getNumericValue(matrix[i][0]);
            max=Math.max(max,sum[i][0]);
        }   
        for(int i=1;i<m;i++)
            for(int j=1;j<n;j++)
            {
                //System.out.println(max);
                if(matrix[i][j]=='1')
                {
                    sum[i][j]=Math.min(sum[i-1][j-1],Math.min(sum[i][j-1],sum[i-1][j]))+1;
                    //System.out.println("i "+i+"j "+j+":sum[i][j]"+sum[i][j]);
                    max=Math.max(max,sum[i][j]);
                    //System.out.println("i "+i+"j "+j+":max"+max);
                }  
                else
                    sum[i][j]=0;
            }
        //System.out.println(Arrays.toString(sum));
        return max*max;
    }
}


