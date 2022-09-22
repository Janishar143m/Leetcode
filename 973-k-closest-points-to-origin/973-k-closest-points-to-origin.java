class Solution {
    
    Queue<Point> queue=new PriorityQueue<>((a,b)->calc(a).compareTo(calc(b)));
    
    public int[][] kClosest(int[][] points, int k) {
        
        int [][] result=new int[k][2];
        
        for(int i=0;i<points.length;i++)
            queue.offer(new Point(points[i][0],points[i][1]));
        
        for(int i=0;i<k;i++)
        {
            Point p=queue.poll();
            result[i][0]=p.x;
             result[i][1]=p.y;
        }   
        
        return result;
        
    }
                                           
     private Double calc(Point p)
                                           {
                                               return Math.sqrt(Math.pow(p.x,2)+Math.pow(p.y,2));
                                           }                                     
    class Point
    {
        int x;
        int y;
        Point(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
}