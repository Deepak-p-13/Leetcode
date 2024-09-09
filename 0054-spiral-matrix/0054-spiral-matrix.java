class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res=new ArrayList<>();
        if(matrix.length==0 && matrix[0].length==0)
            return res;
        int rowlower=0;
        int rowupper=matrix.length-1;
        int colupper=matrix[0].length-1;
        int collower=0;
        while(rowlower<=rowupper && collower<=colupper)
        {
            for(int i=collower;i<=colupper;i++)
            {
                res.add(matrix[rowlower][i]);
            }
            rowlower++;
            for(int i=rowlower;i<=rowupper;i++)
            {
                res.add(matrix[i][colupper]);
            }
            colupper--;

            if(rowlower>rowupper || collower>colupper)
                break;
            for(int i=colupper;i>=collower;i--)
            {
                res.add(matrix[rowupper][i]);
            }
            rowupper--;
            for(int i=rowupper;i>=rowlower;i--)
            {
                res.add(matrix[i][collower]);
            }
            collower++;
        }


        return res;
    }
}