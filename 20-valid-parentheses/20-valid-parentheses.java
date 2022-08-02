class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(!stack.isEmpty() &&((s.charAt(i)==')' && stack.peek()=='(') ||(s.charAt(i)=='}' && stack.peek()=='{')||(s.charAt(i)==']' && stack.peek()=='[')))
                stack.pop();
            else 
                stack.push(s.charAt(i));
            
                
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
        
        
        
        
    }
}