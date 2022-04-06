class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) 
    {
        List<List<Integer>> result=new ArrayList<>();
        Queue<int[]> queue=new PriorityQueue<>((l1,l2)->((l1[0] + l1[1])-(l2[0] + l2[1])));
        
        for(int i=0;i<nums1.length && i<k;i++)
            queue.offer(new int[]{nums1[i],nums2[0],0});
        while(k-->0 && queue.size()>0)
        {
                 int[] p=queue.poll();
                 result.add(Arrays.asList(p[0],p[1]));
                 if(p[2]+1<nums2.length)
                 {
                     queue.offer(new int[]{p[0],nums2[p[2]+1],p[2]+1});
                 }
                
         }
         return result;                                     
                                            
                                              
    }
}                                           