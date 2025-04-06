class Solution {
    public int searchInsert(int[] nums, int target) {
    //     if(nums.length==1){
    //         return 0;
    //     }
    // if(target>nums[nums.length-1]){
    //     return nums.length+1;
    // }
    // if(target<nums[0]){
    //     return 0;
    // }
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(target<nums[mid]){
                high=mid-1;
            }
            else if(target>nums[mid]) {
                low=mid+1;
            }
            else{
                return mid;
            }
        }
        return low;
    }
}