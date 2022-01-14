class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        int[] result=new int[nums.length];
        Arrays.fill(result,-1);
        int len=nums.length;
        for(int i=0;i<2*len;i++)
        {
            int num=nums[i%len];
            while(!stack.isEmpty() && nums[stack.peek()] < num)
                  result[stack.pop()]=num;
             if(i<len)
                  stack.push(i);
        }
        return result;
}
}