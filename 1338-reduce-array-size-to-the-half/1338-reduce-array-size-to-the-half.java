class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        int len=arr.length,ct=0,tot=0;
        for(int a:arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int[] frequencies=new int[map.values().size()];
        int i=0;
        for(int cnt:map.values())
            frequencies[i++]=cnt;
        Arrays.sort(frequencies);
        for(int j=frequencies.length-1;j>=0;j--)
        {
            ct++;
            tot+=frequencies[j];
            if(tot>=len/2)
                return ct;
            
        } 
        return ct;
            
            
    }
}