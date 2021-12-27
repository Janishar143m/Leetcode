class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m-1,l=n-1;
        int t=m+n-1;
        
        while(k>=0 && l>=0)
        {
            if(nums1[k]>=nums2[l])
            {
                
                nums1[t--]=nums1[k--];
            }
            else 
            {
                nums1[t--]=nums2[l--];
            }
          
        }
        while(t>=0 && k>=0)
            nums1[t--]=nums1[k--];
        while(t>=0 && l>=0)
            nums1[t--]=nums2[l--];
    }
}