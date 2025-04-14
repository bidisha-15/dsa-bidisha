class Solution {
    public int findDuplicate(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int ele=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
            else {
                return nums[i];
            }
        }
       return -1; 
    }
}