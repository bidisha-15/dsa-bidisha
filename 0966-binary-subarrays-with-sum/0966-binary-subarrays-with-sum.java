class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return sub(nums,goal)-sub(nums,goal-1);
    }
    private int sub(int[] nums, int goal) {
       int l=0, r=0, sum=0, cnt=0;
       if(goal<0)
       {
        return 0;
       }
       while(r<=nums.length-1){
        sum+=nums[r];
        while(sum>goal){
            sum-=nums[l];
            l++;
        }
        cnt=cnt+(r-l+1);
        r++;
       } 
       return cnt;
    }
}