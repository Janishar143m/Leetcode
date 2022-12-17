class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        List<String> list=new ArrayList<>();
        partitionUtil(0,list,result,s);
        return result;
        
    }
    private void partitionUtil(int index,List<String>list,List<List<String>> result,String s)
    {
        if(index==s.length())
        {
            result.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=index;i<s.length();i++)
        {
            if(palindrome(s,index,i))
            {
                list.add(s.substring(index,i+1));
                partitionUtil(i+1,list,result,s);
                list.remove(list.size()-1);  
                
            }
        }
    }
     private boolean palindrome(String s,int start,int end)
     {
         while(start<=end)
         {
             if(s.charAt(start++)!=s.charAt(end--))
             {
                 return false;
             }
         }
         
         return true;
     }
}