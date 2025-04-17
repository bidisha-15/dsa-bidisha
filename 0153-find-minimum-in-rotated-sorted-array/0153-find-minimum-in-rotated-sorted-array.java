class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int min=Integer.MAX_VALUE;
        while (low <= high) {
            mid = low + (high - low) / 2;
            min=Math.min(min, nums[mid]);
            if (nums[low] < nums[mid]) {
                if (nums[low] > nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (nums[mid] < nums[high]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return min;
    }
}