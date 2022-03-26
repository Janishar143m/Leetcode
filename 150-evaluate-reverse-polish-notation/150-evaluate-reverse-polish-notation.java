class Solution {
    public int evalRPN(String[] tokens) {
        int res=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            String c=tokens[i];
            if(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/"))
            {
                if(stack.size()>1)
                {
                    
                    int oper1=stack.pop();
                    int oper2=stack.pop();
                   //System.out.println(oper1);
                   // System.out.println(oper2);
                    //System.out.println(c);
                    int result=0;
                    if(c.equals("+"))
                      result=oper1+oper2;
                    else if(c.equals("-"))
                        result=oper2-oper1;
                    else if(c.equals("/"))
                        result=oper2/oper1;
                    else if (c.equals("*"))
                        result=oper1*oper2;
                    //System.out.println(result);
                    stack.push(result);
                }
                    
            }
            else
                stack.push(Integer.parseInt(c));
        }
        return stack.pop();
        
        
    }
}