class Solution {
    public int kthSmallest(int[][] mat, int k) {
        Queue<int[]> queue=new PriorityQueue<>((a,b)->a[a.length-1]-b[b.length-1]);
        int[] array=new int[mat.length+1];
        Set<String> set=new HashSet<>();
        findSum(array,mat);
        //System.out.println("Initial sum is:"+array[array.length-1]);
        set.add(hash(array));
        int ct=0;
        //array[array.length-1]=sum;
        queue.offer(array);
        while(ct<k-1)
        {
            int top[]=queue.poll();
            //System.out.println("Queue size after polling:"+queue.size());
            for(int r=0;r<mat.length;r++)
            {
                if(top[r]+1<mat[0].length)
                {
                    int[] newArray=top.clone();
                    newArray[r]++;
                    String s=hash(newArray);
                    if(!set.contains(s))
                    {
                        newArray[newArray.length-1]=newArray[newArray.length-1]+mat[r][newArray[r]]-mat[r][newArray[r]-1];
                        queue.offer(newArray);
                        //System.out.println(queue.size());
                        set.add(s);
                    }   
                    
                }
            }
            ++ct;
        }
       // System.out.println("Atlast queue size is:"+queue.size());
        return queue.peek()[queue.peek().length-1];
                
                
        
    }
    
    public String hash(int[] array)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<array.length-1;i++)
        {
            sb.append(array[i]);
            sb.append(":");
        }
        return sb.toString();
    }
    public void findSum(int newArray[],int mat[][])
    {
        int sum=0;
        for(int i=0;i<mat.length;i++)
            sum+=mat[i][0];
        newArray[newArray.length-1]=sum;
            
    }
}