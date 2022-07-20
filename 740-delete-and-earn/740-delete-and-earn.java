class Solution {
    public int deleteAndEarn(int[] nums) {
        
        Map<Integer,Integer> map=new TreeMap<>();
        Arrays.sort(nums);
        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);
        //System.out.println()
        int prevOne=0,prevTwo=0;
        int []arr=new int[map.size()];
        int i=0;
        for(int val:map.keySet() )
            arr[i++]=val;
        //System.out.println("Array is:"+Arrays.toString(arr));
        for(int j=0;j<arr.length;j++)
        {
            int currEarn=arr[j]*map.get(arr[j]);
            //System.out.println("Currentearn:"+currEarn);
            if(j>0 && arr[j-1]+1==arr[j])
            {
                int temp=prevTwo;
                prevTwo=Math.max(currEarn+prevOne,prevTwo);
                prevOne=temp;
            }
            else
            {
                int temp=prevTwo;
                prevTwo=currEarn+prevTwo;
                prevOne=temp;
            }
                
        }
        return prevTwo;
        
        
        
    }
}