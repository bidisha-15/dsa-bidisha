class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum=0;
        int max_sum=nums[0];//negative infinity
        for(int i=0;i<nums.length;i++){
            curr_sum+=nums[i];
            max_sum=Math.max(curr_sum,max_sum);
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        return max_sum;
    }
}