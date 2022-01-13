class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        List<Integer>list=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++)
            if(map.getOrDefault(nums2[i],0)>0)
            {
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }   
        //int n=list.size();
       // list=new ArrayList<>(set);
        
         return list.stream().mapToInt(i->i).toArray();
                
    }
}
