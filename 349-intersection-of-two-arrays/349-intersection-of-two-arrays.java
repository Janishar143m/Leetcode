class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<Integer>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
            if(set.contains(nums2[i]))
            {
                if(!list.contains(nums2[i]))
                  list.add(nums2[i]);
            }   
        //int n=list.size();
       // list=new ArrayList<>(set);
        
         return list.stream().mapToInt(i->i).toArray();
                
    }
}