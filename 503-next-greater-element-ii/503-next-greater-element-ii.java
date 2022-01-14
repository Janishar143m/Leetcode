class Solution {
    public int[] nextGreaterElements(int[] nums) {
         //Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        int[] result=new int[nums.length];
        Arrays.fill(result,-1);
        int flag=0;
        for(int i=0;i<nums.length;i++)
        {
            flag=0;
          for(int j=i+1;j<nums.length;j++)
              if(nums[j]>nums[i])
              {
                  result[i]=nums[j];
                  flag=1;
                  break;
              }
            if(flag==0)
            {
                for(int k=0;k<i;k++)
                     if(nums[k]>nums[i])
                        {
                             result[i]=nums[k];
                            flag=1;
                            break;
                        }  
            }
    }
        return result;
}
}