class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high=matrix.length-1;
        int mid=0;
        int found=-1;
            while(low<=high){
                mid=low+(high-low)/2;
                if(target>=matrix[mid][0] && target<=matrix[mid][matrix[mid].length-1]){
                    found=mid;
                    break;
                }
                else if(target<matrix[mid][0]){
                    high=mid-1;
                }
                else if(target>matrix[mid][matrix[mid].length-1]){
                    low=mid+1;
                }
            }
            if(found==-1){
                return false;
            }
        low=0;
        high=matrix[found].length-1;
        mid=0;
            while(low<=high){
                mid=low+(high-low)/2;
                if(target==matrix[found][mid]){
                    return true;
                }
                else if(target<matrix[found][mid]){
                    high=mid-1;
                }
                else if(target>matrix[found][mid]){
                    low=mid+1;
                }
            }
            return false;
    }
}