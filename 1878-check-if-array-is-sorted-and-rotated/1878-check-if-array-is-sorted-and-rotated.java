class Solution {
    public boolean check(int[] nums) {
        int flag=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                flag++;
            }
        }
        if(flag==1){
            if(nums[0]>=nums[nums.length-1]){
                return true;
            }
        }
        if(flag==0){
            return true;
        }
        else{
            return false;
        }
    }
}