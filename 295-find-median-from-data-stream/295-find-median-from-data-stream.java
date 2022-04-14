class MedianFinder {
    Boolean even;
    Queue<Integer> queue1;
    Queue<Integer>queue2;
    public MedianFinder() {
       even=true;
        queue1=new PriorityQueue<Integer>(Collections.reverseOrder());
        queue2=new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
     if(even)
     {
         queue2.offer(num);
         queue1.offer(queue2.poll());
     }
     else
     {
         queue1.offer(num);
         queue2.offer(queue1.poll());
     }
     even=!even;
        
    }
    
    public double findMedian() {
        
        if(even)
            return (double)(queue1.peek()+queue2.peek())/2;
        else
            return queue1.peek();
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */