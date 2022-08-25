class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        if(m>n)
            return findMedianSortedArrays(nums2,nums1);
        int tot=m+n;
        int half=(tot+1)/2;
        int left=0;
        int right=m;
        while(left<=right)
        {
            int i=left+(right-left)/2;
            int j=half-i;
            int left1=i>0?nums1[i-1]:Integer.MIN_VALUE;
            int right1=i<m?nums1[i]:Integer.MAX_VALUE;
            int left2=j>0?nums2[j-1]:Integer.MIN_VALUE;
            int right2=j<n?nums2[j]:Integer.MAX_VALUE;
            if(left1<=right2 && left2<=right1)
            {
                if(tot%2==0)
                {
                    return (double)(Math.max(left1,left2)+Math.min(right1,right2))/2;
                    
                }
                else
                    return Math.max(left1,left2);
                
            }
            else if(left1>right2)
                right=i-1;
            else
                left=i+1;
                
        }
        return -1;
        
    }
}