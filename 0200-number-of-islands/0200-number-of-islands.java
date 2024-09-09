class Solution {
    public static void dfs(char grid[][],int row,int col,boolean visited[][])
    {
        if(row<0 || col<0 ||  row>=grid.length || col>=grid[0].length|| visited[row][col] ||grid[row][col]=='0')
        {
            return ;
        }
        visited[row][col]=true;
        dfs(grid,row,col-1,visited);
        dfs(grid,row-1,col,visited);
        dfs(grid,row,col+1,visited);
        dfs(grid,row+1,col,visited);
    }
    public int numIslands(char[][] grid) {
        int col=grid[0].length;
        int row=grid.length;
        boolean visited[][]=new boolean[row][col];
        int islandcount=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               
                if(!visited[i][j] && grid[i][j]=='1')
                {
                     dfs(grid,i,j,visited);
                        islandcount++;
                }
             }
        }
        return islandcount;
    }
}