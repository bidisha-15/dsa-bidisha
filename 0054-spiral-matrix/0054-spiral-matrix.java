class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int cnt=m*n;
        int row=0; int col=0; int i=0;
        while(cnt>0){
            for(i=col;i<=n-1;i++){
                list.add(matrix[row][i]);
                cnt--;
            }
            if(cnt==0) break;
            for(i=row+1;i<=m-2;i++){
                list.add(matrix[i][n-1]);
                cnt--;
            }
            if(cnt==0) break;
            for(i=n-1;i>=col;i--){
                list.add(matrix[m-1][i]);
                cnt--;
            }
            if(cnt==0) break;
            for(i=m-2;i>=row+1;i--){
                list.add(matrix[i][col]);
                cnt--;
            }
            if(cnt==0) break;
            row++; col++; m--; n--;
        }
        return list;
    }
}