class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3)
            return false;
        for(int i=0;i<=arr.length-3;i++)
        {
            int result=1;
            for(int j=i;j<i+3;j++)
                result=result&arr[j];
            if(result==1)
                return true;
        }
        return false;
        
    }
}