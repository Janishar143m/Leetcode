class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(Integer num:nums)
        {
            int pos=Collections.binarySearch(list,num);
            if(pos<0)
                pos=~pos;
            if(pos==list.size())
                list.add(num);
            else
                list.set(pos,num);
        }
        return list.size();
        
    }
}