class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0; 
        int high=nums.length-1;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(mid==0 || mid==nums.length-1 || (nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])){
                return nums[mid];
            }
            else if(nums[mid]==nums[mid-1]){
                if((mid-1-0)%2==0){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else{
                if((nums.length-1-mid-1)%2==0){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return nums[mid];
    }
}