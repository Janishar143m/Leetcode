class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] result=new int [2*n];
        int i=0,j=n,ct=0;
        int flag=0;
        if(nums.length<=2)
            return nums;
        while(i<n || j<2*n)
        {
            if(flag==0)
            {
                result[ct++]=nums[i++];
                flag=1;
            }
            else
            {
                result[ct++]=nums[j++];
                flag=0;
            }
                
        }
        return result;
    }
}