class Solution {
    
    Queue<int[]> queue=new PriorityQueue<>((a,b)->new Double(Math.sqrt(Math.pow(a[0],2)+Math.pow(a[1],2))).compareTo(new Double(Math.sqrt(Math.pow(b[0],2)+Math.pow(b[1],2)))));
    
    public int[][] kClosest(int[][] points, int k) {
        
        int [][] result=new int[k][2];
        
        for(int i=0;i<points.length;i++)
            queue.offer(points[i]);
        
        for(int i=0;i<k;i++)
           result[i]=queue.poll();
        
        return result;
        
    }
    
}