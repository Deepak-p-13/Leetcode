class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map=new TreeMap<>();
        for(int i=0;i<heights.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        System.out.print(map);
        String str[]=new String[names.length];
        int index=names.length-1;
        for(String i:map.values())
        {
                str[index--]=i;
        }
     return str;
    }
}