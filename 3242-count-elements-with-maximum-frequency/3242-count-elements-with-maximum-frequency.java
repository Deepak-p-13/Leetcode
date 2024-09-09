class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
         for (int value : map.values()) {
            if (max < value) {
                max = value;
            }
        }
         int f=0;
         for(int i: map.values())
         {
            if( i==max)
            {
                f=f+i;
            }
         }
         
        System.out.print(max);
        return f;
    }
}