class Solution {
    public void nextPermutation(int[] nums) {
        int x=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                x=i-1;
                break;
            }
        }
        if(x == -1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>0;i--){
           if(nums[i]>nums[x]){
            int temp=nums[i];
            nums[i]=nums[x];
            nums[x]=temp;
            break;
           } 
        }
        reverse(nums, x+1, nums.length-1);
    }
    static void reverse(int arr[], int start, int end){
        //Base case
         if(start >= end)
             return;

        //Swap the numbers 
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        //Reverse the remaining array
        reverse(arr,start+1,end-1);
    }
}