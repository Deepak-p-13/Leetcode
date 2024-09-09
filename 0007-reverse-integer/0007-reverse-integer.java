class Solution {
    public int reverse(int x) {
        long res=0,result=0;
        while(x!=0)
        {
             res=x%10;
            result=result*10+res;
            x=x/10;
        }
           if (result>Integer.MAX_VALUE || result <Integer.MIN_VALUE)
            {
                    return  0;
            }

         
        return (int )result;
    }
}