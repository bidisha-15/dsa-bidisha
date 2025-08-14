class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;//negative infinity
        for(int i=0;i<arr.length;i++){
            curr_sum+=arr[i];
            max_sum=Math.max(curr_sum,max_sum);
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        return max_sum;
    }
}
