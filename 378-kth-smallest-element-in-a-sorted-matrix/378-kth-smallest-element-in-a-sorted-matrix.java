class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        Queue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        int ct=0;
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++)
            {
                if(ct<k)
                {
                    ct++;
                    queue.offer(matrix[i][j]);
                    
                }
                else
                {
                    if(matrix[i][j]<queue.peek())
                    {
                        ct++;
                        queue.poll();
                        queue.offer(matrix[i][j]);
                        
                    }
                }
            }
        
        return queue.peek();
        
    }
}