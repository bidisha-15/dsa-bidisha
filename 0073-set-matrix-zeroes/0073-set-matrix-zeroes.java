class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        // int c=1;
//         for (int i=0;i<m;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(matrix[i][j]==0)
//                 {
//                    matrix[i][0] = 0;
//                     if (j == 0)
//                         c = 0;
//                     else
//                         matrix[0][j] = 0;
//                 }
//             }
//         }

//         for (int i = 1; i < m; i++) {
//             for (int j = 1; j < n; j++) {
//                 if (matrix[i][j] != 0) {

//                     if (matrix[i][0] == 0 || matrix[0][j] == 0) 
//                     {
//                         matrix[i][j] = 0;
//                     }
//                 }
//             }
//         }

//         if (matrix[0][0] == 0) {
//             Arrays.fill(matrix[0], 0);
//         }
//         if (c == 0) {
//             for (int i = 0; i < m; i++) {
//                 matrix[i][0] = 0;
//             }
//         }
        
        int rows[]=new int [m];
        int cols[]=new int [n];
         for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows[i]=1;
                    cols[j]=1;
                }
            }
         }
        
        for(int i=0;i<m;i++)
        {
            if(rows[i]==1){
            for(int j=0;j<n;j++)
                
                {
                    matrix[i][j]=0; 
                }
            }
            }
        
        for(int i=0;i<n;i++)
        {
            if(cols[i]==1)
                {
            for(int j=0;j<m;j++){
                
                    matrix[j][i]=0; 
                }
            }
        }
        }
    }



    
