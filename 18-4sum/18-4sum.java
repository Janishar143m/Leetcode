class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int len=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        ArrayList<ArrayList<Integer>>resultList=kSum(nums, 0, 4, target);
        for(ArrayList<Integer>k:resultList)
        {
          // if(!result.contains(k))
               result.add(k);
        }
        return result;
    }
    public static ArrayList<ArrayList<Integer>>kSum(int[] nums,int i,int k,int target)
    {
        int len=nums.length;
        ArrayList<ArrayList<Integer>>result=new ArrayList<ArrayList<Integer>>();
        if(k==2)
        {
                int left=i;
                int right=nums.length-1;
                while(left<right)
                {
                    int sum=nums[left]+nums[right];
                    if(sum==target)
                    {
                         result.add(new ArrayList<>(Arrays.asList(nums[left],nums[right])));
                        while(left<right && nums[left]==nums[left+1])
                            left++;
                        while(left<right && nums[right]==nums[right-1])
                            right--;
                        left++;
                        right--;
                    }
                    else if(sum<target)
                        left++;
                    else
                        right--;


                }
            }

        else
        {
            for(int j = i; j < len - (k - 1); j++)
            {
                ArrayList<ArrayList<Integer>> list=kSum(nums,j+1,k-1,target-nums[j]);
                if(list!=null)
                {
                    for(ArrayList<Integer> t : list)
                    {
                        //ArrayList<Integer> t1=new ArrayList<>(t);
                        ////list.remove(t);
                        t.add(0,nums[j]);
                        //list.add(t1);
                        //System.out.println(t);

                    }
                     for(ArrayList<Integer> t : list)
                        if(!result.contains(t))
                           result.addAll(list);


                }
                //while(nums[j]==nums[j+1])
                    //j++;


            }
        }
        return result;
    }
}   