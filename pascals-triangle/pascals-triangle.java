class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>>result=new ArrayList<>();
       List<Integer>list= new ArrayList<>();
        list.add(1);
        result.add(list);
        for(int j=0;j<numRows-1;j++)
          {
            int k=list.size();
            List<Integer>list1= new ArrayList<>(k+1);
            for(int i=0;i<=k;i++)
           {
              if(i==0||i==k)
                  list1.add(1);
              else
              {
                  int num1=list.get(i-1);
                  int num2=list.get(i);
                  int sum=num1+num2;
                  list1.add(sum);
              }
          }
        result.add(list1);
        list=list1;

            
        }
        return result;
        
    }
}