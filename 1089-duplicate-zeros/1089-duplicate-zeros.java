class Solution {
    public void duplicateZeros(int[] arr) {
        
        int i=0,n=arr.length;
        while(i<n)
        {
            if(arr[i]==0)
            {
                shiftRight(arr,i);
                i=i+2;

            }
            else 
                i=i+1;
            
        }
        
    }
    void shiftRight(int arr[],int i)
    {
        int n=arr.length;
        int j=n-2;
        while(j>=i+1)
        {
            arr[j+1]=arr[j];
            j=j-1;
            
        }
        if(i<n-1)
         arr[i+1]=0;
        
    }
}