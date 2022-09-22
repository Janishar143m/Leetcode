class Solution {
    
    Queue<Point> queue=new PriorityQueue<>((a,b)->new Double(Math.sqrt(Math.pow(a.x,2)+Math.pow(a.y,2))).compareTo(new Double(Math.sqrt(Math.pow(b.x,2)+Math.pow(b.y,2)))));
    
    public int[][] kClosest(int[][] points, int k) {
        
        int [][] result=new int[k][2];
        
        for(int i=0;i<points.length;i++)
            queue.offer(new Point(points[i][0],points[i][1]));
        
        for(int i=0;i<k;i++)
        {
            Point p=queue.poll();
            result[i][0]=(int)p.x;
             result[i][1]=(int)p.y;
        }   
        
        return result;
        
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