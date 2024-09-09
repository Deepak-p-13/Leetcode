class Solution {
    public int divide(int dividend, int divisor) {
        int res=0;
        if(dividend <0 && divisor<0)
        {
            res=(dividend/divisor);
            if(res==-2147483648)
            {
                return 2147483647;
            }
        }
        else
        {
            res=(dividend/divisor);
        }

        return res;
    }
}