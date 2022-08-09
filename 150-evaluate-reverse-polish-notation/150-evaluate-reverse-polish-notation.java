class Solution {
    Stack<Integer> stack=new Stack<>();
    public int evalRPN(String[] tokens) {
        
        for(int i=0;i<tokens.length;i++)
        {
            String str=tokens[i];
           // System.out.println(str);
            //System.out.println("Stack before operation:"+stack.toString());
            if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/"))
            {
                int result=0;
                if(stack.size()>=2)
                {
                    
                    Integer i1=stack.pop();
                    Integer i2=stack.pop();
                    switch(str)
                    {
                        case "+":
                            result=i1+i2;
                            break;
                        case "-":
                            result=i2-i1;
                            break;
                        case "/":
                           result=i2/i1;
                            break;
                        case "*":
                            result=i2*i1;
                            break;
                        
                    }
                    //System.out.println(result);
                    stack.push(result);
                    //System.out.println("Stack after operation:"+stack.toString());
                }
            }
            else
                stack.push(Integer.parseInt(str));
        }
        return stack.pop();
        
    }
}