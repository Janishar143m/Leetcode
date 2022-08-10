import java.util.HashSet;
class Solution {
    Set<String> result=new HashSet<>();
    //StringBuilder str=new StringBuilder();
    private void generateParanthesisUtil(int noOfOpen,int noOfClose,int n,String str)
    {
        //String res=null;
       // System.out.println(str);
           if(noOfOpen==noOfClose && noOfOpen==n)
        {
            if(!result.contains(str))
                result.add(str);
            //str.deleteCharAt(str.length() - 1);
             //System.out.println("inside term point");  
             return;
               
        }
         
        if(noOfOpen<n)
        {
            
            generateParanthesisUtil(noOfOpen+1,noOfClose,n,str.concat("("));
        }    
        if(noOfClose<noOfOpen)
        {
            
            generateParanthesisUtil(noOfOpen,noOfClose+1,n,str.concat(")"));
        }   
     
     
    }
    
    public List<String> generateParenthesis(int n) {
        
        generateParanthesisUtil(0,0,n,new String());
        return result.stream().collect(Collectors.toList());
        
    }
}