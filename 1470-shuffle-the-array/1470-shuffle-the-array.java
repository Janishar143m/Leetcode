class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] result=new int [2*n];
        int i=0,ct=0;
        //int flag=0;
        if(nums.length<=2)
            return nums;
        while(i<n)
        {
         
            
                result[ct++]=nums[i];
                result[ct++]=nums[i+n];
                i++;
               
            
                
        }
        return result;
    }
}