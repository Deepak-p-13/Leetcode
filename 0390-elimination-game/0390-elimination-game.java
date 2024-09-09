class Solution {
    public int lastRemaining(int n) {
        int head=1;
        int r=n;
        boolean l=true;
        int s=1,h=1;
        while(r>1)
        {
            if(r%2==1  || l)
            {
                h=h+s;
            }
            r=r/2;
            s=s*2;
            l=!l;
            
        }
        return h;
    }
}