
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int result[][];
        Queue<Point> queue=new PriorityQueue<>((p1,p2)->calc(p1).compareTo(calc(p2)));
        for(int i=0;i<points.length;i++)
           queue.offer(new Point(points[i][0],points[i][1]));
        result=new int[k][2];
        for(int i=0;i<k;i++)
        {
            Point p=queue.poll();
            result[i][0]=p.x;
            result[i][1]=p.y;
        
        }
        return result;
        
    }
    public Double calc(Point p)
    {
        return Math.sqrt(p.x*p.x+p.y*p.y);
    }
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