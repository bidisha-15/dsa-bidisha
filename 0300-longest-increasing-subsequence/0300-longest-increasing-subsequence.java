class Solution {
    public int searchInsert(int[] nums, int target,int high) {
        int low=0;
        high=high-1;
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
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        
        int temp[]=new int[nums.length];
        temp[0]=nums[0];
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>temp[cnt-1]){
                temp[cnt++]=nums[i];
            }
            else{
                temp[searchInsert(temp,nums[i],cnt)]=nums[i];
            }
        }
        return cnt;
        }
    }
