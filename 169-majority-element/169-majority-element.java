class Solution {
    public int majorityElement(int[] nums) {
     int ct=1,majority=nums[0];
     for(int i=1;i<nums.length;i++)
     {
         if(nums[i]==majority)
             ct++;
         else if(ct>1)
             ct--;
         else
         {
             majority=nums[i];
             ct=1;
         }
     }
        return majority;
        
    }
}