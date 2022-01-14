class Solution {
    public int nextGreaterElement(int n) {
        String s=Integer.toString(n);
        char[] arr=s.toCharArray();
        int max=-1,i=0;
        char small;
        for(i=arr.length-1;i>=1;i--)
          if(arr[i]>arr[i-1])
               break;
        if(i==0)
            return -1;
        small=arr[i-1];
        max=i;
         for(int k=i+1;k<arr.length;k++)
            {
                //small=arr[i+1];
                if(arr[k]>small && arr[k]<=arr[max])
                    max=k;
            }
            char temp=arr[i-1];
            arr[i-1]=arr[max];
            arr[max]=temp;
            Arrays.sort(arr,i,arr.length);
            Long res=Long.parseLong(new String(arr));
            return (res>Integer.MAX_VALUE)?-1:res.intValue();
        
        }
}