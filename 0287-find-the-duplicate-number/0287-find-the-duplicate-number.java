class Solution {
    public int findDuplicate(int[] nums) {
        boolean set[]=new boolean[nums.length];
        for(int i:nums)
        {
            if(set[i])
              return i;
            else
                set[i]=true;
              
        }
        return 0;
    }
}