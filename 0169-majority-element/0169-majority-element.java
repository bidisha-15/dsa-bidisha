class Solution {
    public int majorityElement(int[] nums) {
        // if(nums.length==1){
        //     return nums[0];
        // }
        int cnt=0;
        int ele=nums[0];
        int n=nums.length;
        Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         cnt++;
        //     }
        //     if(cnt>=Math.floor(n/2)){
        //         ele=nums[i];
        //         break;
        //     }
        // }
        // return ele;
            return nums[(n/2)];

    }
}