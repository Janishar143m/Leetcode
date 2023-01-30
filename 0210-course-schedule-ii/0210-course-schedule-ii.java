class Solution {
    public int[] findOrder(int n, int[][] p) {
        List<List<Integer>> nm=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            nm.add(new ArrayList<>());
        }
        for(int i=0;i<p.length;i++)
        {
            nm.get(p[i][1]).add(p[i][0]);
        }
        Queue<Integer> kk=new LinkedList<>();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int k:nm.get(i))
            {
                a[k]++;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                kk.offer(i);
            }
        }
        int k[]=new int[n];
        int i=0;
        while(!kk.isEmpty())
        {
            int x=kk.poll();
            k[i++]=x;
            for(int j:nm.get(x))
            {
                a[j]--;
                if(a[j]==0)
                {
                    kk.offer(j);
                }
            }
        }
        return i==n ? k : new int[0];
    }
}