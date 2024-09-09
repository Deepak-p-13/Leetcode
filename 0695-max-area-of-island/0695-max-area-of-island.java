class Solution {
    public static void dfs(int  grid[][],int row,int col,boolean visited[][],int max[])
    {
        if(row<0 || col<0 ||  row>=grid.length || col>=grid[0].length|| visited[row][col] ||grid[row][col]==0)
        {
            return ;
        }
        visited[row][col]=true;
        max[0]++;
        dfs(grid,row,col-1,visited,max);
        dfs(grid,row-1,col,visited,max);
        dfs(grid,row,col+1,visited,max);
        dfs(grid,row+1,col,visited,max);
    }
    public int maxAreaOfIsland(int[][] grid) {
         int col=grid[0].length;
        int row=grid.length;
        boolean visited[][]=new boolean[row][col];
        int islandcount=0;
         int prev=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               
                if(!visited[i][j] && grid[i][j]==1)
                {
                         int max[]={0};
                     dfs(grid,i,j,visited,max);
                       System.out.println(max[0]);
                       if(max[0]>prev)
                         prev=max[0];
                     
                }
             }
        }
        return prev;
    }
}

