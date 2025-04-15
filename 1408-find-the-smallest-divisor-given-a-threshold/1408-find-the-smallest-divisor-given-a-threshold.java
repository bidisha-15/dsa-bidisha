class Solution {
    public static int sum(int[] nums, int div){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+= (nums[i]+div-1)/div;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max =nums[0];
        for(int i=0;i<nums.length;i++){
            max = Math.max(max, nums[i]);
        }
        int start=1;
        int end = max;
        int mid = 0;
        while(start <= end){
            mid = (start + end) / 2 ;
            int x = sum(nums,mid);
            if(x <= threshold){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}