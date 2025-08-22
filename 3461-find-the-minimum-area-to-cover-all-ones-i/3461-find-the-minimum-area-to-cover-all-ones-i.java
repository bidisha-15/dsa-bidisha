class Solution {
    public int minimumArea(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int area;
        int top=m-1, left=n-1, right=0, bottom=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1)
                {
                    top=Math.min(top,i);
                    bottom=Math.max(i,bottom);
                    left=Math.min(left,j);
                    right=Math.max(j,right);
                }
            }
        }
        area=(bottom-top+1)*(right-left+1);
        return area;
    }
}