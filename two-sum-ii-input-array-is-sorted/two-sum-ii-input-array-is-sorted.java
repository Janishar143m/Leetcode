class Solution {
    public int[] twoSum(int[] a, int target) {
        
        int i=0,j=a.length-1;
        int result[]=new int[2];
        while(i<=j && j>=0)
        {
            if(a[i]+a[j]>target)
                j--;
            else if(a[i]+a[j]<target)
                i++;
            else
            {
                result[0]=i+1;
                result[1]=j+1;
                return result;
            }
        }
        return result;
    }
}