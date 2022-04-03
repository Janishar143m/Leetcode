
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int result[][];
        Queue<int[]> queue=new PriorityQueue<>((p1,p2)->calc(p1).compareTo(calc(p2)));
        for(int i=0;i<points.length;i++)
           queue.offer(points[i]);
        result=new int[k][2];
        for(int i=0;i<k;i++)
        {
            result[i]=queue.poll();
         
        
        }
        return result;
        
    }
    public Double calc(int [] arr)
    {
        return Math.sqrt(arr[0]*arr[0]+arr[1]*arr[1]);
    }
}