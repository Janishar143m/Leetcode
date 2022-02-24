class Solution {
    public void duplicateZeros(int[] arr) {
        int j=arr.length-1;
        int i=0;
        if(j==0)
            return;
        while(i<j)
        {
            if(arr[i]==0)
            {
                shiftRight(i,j,arr);
                arr[i+1]=0;
                i=i+2;
                //j--;
            }
            else
                i++;
        }
        
    }
      void shiftRight(int i,int j,int arr[])
    {
        int n=arr.length;
        while(j>=i+1)
        {
            if(j<n-1)
             arr[j+1]=arr[j];
            j=j-1;
            
        }
        
    }
}