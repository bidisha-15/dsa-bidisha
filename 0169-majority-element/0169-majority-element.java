// class Solution {
//     public int majorityElement(int[] nums) {
//         // int cnt=0;
//         // int ele=nums[0];
//         // int n=nums.length;
//         Arrays.sort(nums);
//         // for(int i=0;i<nums.length-1;i++){
//         //     if(nums[i]==nums[i+1]){
//         //         cnt++;
//         //     }
//         //     if(cnt>=Math.floor(n/2)){
//         //         ele=nums[i];
//         //         break;
//         //     }
//         // }
//         // return ele;
//             return nums[(nums.length/2)];

//     }
// }
class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int majority = 0;
        
        for (int n : nums) {
            if (majority == 0) {
                res = n;
            }
            
            majority += n == res ? 1 : -1;
        }
        
        return res;        
    }
}