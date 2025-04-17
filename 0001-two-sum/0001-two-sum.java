class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map=new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[0]=map.get(target-nums[i]); //gives the value associated with it, thus the index no.
                res[1]=i;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}