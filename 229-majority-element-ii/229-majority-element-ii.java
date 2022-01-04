class Solution {
    public List<Integer> majorityElement(int[] nums) {
         
        int ct=1,maj=nums[0];
        int num=(int)((nums.length)/3);
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        List<Integer>result=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
         for (Map.Entry mapElement : map.entrySet()) {
           Integer key = (Integer)mapElement.getKey();
             int value = ((int)mapElement.getValue());
             if(value>num)
                 result.add(key);
        }
        return result;
        
}
}