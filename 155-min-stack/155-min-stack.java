class MinStack {
    Stack<Integer> stack;
    Stack<Integer>minStack;
    public MinStack() {
        stack=new Stack<Integer>();
        minStack=new Stack<Integer>();
        
    }
    
    public void push(int val) {
        
        stack.push(val);
        if(minStack.isEmpty()||minStack.peek()>val)
            minStack.push(val);
        else
            minStack.push(minStack.peek());
        
    }
    
    public void pop() {
       
     if(stack.size()>0 && minStack.size()>0)
     {
          stack.pop();
          minStack.pop();
     }   
       
        
        
    }
    
    public int top() {
        
        return stack.peek();
        
    }
    
    public int getMin() {
        
        return minStack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */