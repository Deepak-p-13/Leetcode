class Solution {
    public int[] twoSum(int[] nums, int target) {
       int i=0,j=0;
        for( i=1;i<nums.length;i++)
        {
            for( j=i;j<nums.length;j++)
            {
            if(target==nums[j]+nums[j-i])
            {
                 return new int[] {j,j-i};
            }

            }
        }
         return new int[] {-1,-1};
    }
}