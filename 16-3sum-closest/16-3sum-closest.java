class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int smallestDiff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++)
        {
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                int diff=target-nums[left]-nums[right]-nums[i];
                if(diff==0)
                    return target-diff;
                if(Math.abs(diff) <Math.abs(smallestDiff)||(Math.abs(diff)==Math.abs(smallestDiff) && diff>smallestDiff))
                    smallestDiff=diff;
                
                if(diff>0)
                    left++;
                else
                    right--;

            }
        }
        return target-smallestDiff;
        
    }
}