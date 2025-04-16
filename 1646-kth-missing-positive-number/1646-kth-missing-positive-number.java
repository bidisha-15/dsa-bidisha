class Solution {
    public int findKthPositive(int[] arr, int k) {
        int miss_cnt=0;
        int prev=0;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                miss_cnt+=arr[i]-1;
                if(k<=miss_cnt){
        return k;
    }
            }
            else{
                prev=miss_cnt;
                miss_cnt+=arr[i]-arr[i-1]-1;
            }
    if(k<=miss_cnt){
        return arr[i-1]+(k-prev);
    }
        }
        return arr[arr.length-1]+(k-miss_cnt);
    }
}