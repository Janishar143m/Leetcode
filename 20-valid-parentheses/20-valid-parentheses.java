class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{')
            {
                stack.push(c);
            }
            else
            {
                Character openChar=null;
                if(!stack.isEmpty())
                  openChar=stack.pop();
                if(map.get(c)!=openChar)
                    return false;  
            }
        }
        if(stack.isEmpty())
         return true;
        else
          return false;  
    }
}