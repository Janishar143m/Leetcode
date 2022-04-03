
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int result[][];
        Queue<Point> queue=new PriorityQueue<>((p1,p2)->calc(p2).compareTo(calc(p1)));
        for(int i=0;i<points.length;i++)
        {
            if(queue.size()<k)
                queue.offer(new Point(points[i][0],points[i][1]));
            else 
            {
                Point point=queue.peek();
                double val=Math.sqrt(point.x*point.x+point.y*point.y);
                //System.out.println(val);
                double currentVal=Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1]);
               // System.out.println(currentVal);
                if(val>currentVal)
                {
                    queue.poll();
                    queue.offer(new Point(points[i][0],points[i][1]));
                }
            }
        }
        result=new int[k][2];
        int i=0;
        while(queue.size()>0)
        {
            Point p=queue.poll();
            result[i][0]=p.x;
            result[i][1]=p.y;
            i++;
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