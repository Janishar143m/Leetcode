class Solution {
    
     private Map<Character, String> digitToChar =Map.of('2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",'7',"pqrs",'8',"tuv",'9',"wxyz");
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
        {
            return new ArrayList<>();
        }
        List<String> ans=new ArrayList<>();
        String curr="";
        findPermutations(ans,curr,digits,0);
        return ans;
        
        
        
    }
    private void findPermutations(List<String> ans,String curr,String digits,int index)
    {
        if(curr.length()==digits.length())
        {
            ans.add(curr);
            return;
        }
        else
        {
            String val=digitToChar.get(digits.charAt(index));
            for(char c:val.toCharArray())
            {
                findPermutations(ans,curr+c,digits,index+1);
            }
        }
    }
    
}