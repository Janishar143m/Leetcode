class MedianFinder {
    
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MedianFinder() {
       queue1=new PriorityQueue<>((a,b)->(b-a)); 
       queue2=new PriorityQueue<>((a,b)->(a-b));
       
    }
    
    public void addNum(int num) {
        
        
      
          queue1.offer(num);
          if(queue1.size()>1 && queue1.size()>queue2.size())
            queue2.offer(queue1.poll());
        if(queue2.size()>1 && queue2.size()>queue1.size())
            queue1.offer(queue2.poll());
       
        
    }
    
    public double findMedian() {
        
        if(queue1.size()==queue2.size())
            return ((double)queue1.peek()/2+(double)queue2.peek()/2);
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