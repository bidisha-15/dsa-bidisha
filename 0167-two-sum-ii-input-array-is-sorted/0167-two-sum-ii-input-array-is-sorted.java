class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         for (int i=0;i<numbers.length;i++){
//             for(int j=i+1;j<numbers.length;j++){
//                 if (target==numbers[i]+numbers[j]){
//                  return new int[]{i+1,j+1};
//                 }
//             }
//         }
//        return new int[] {};
//     }
// }

public int[] twoSum(int[] nums, int target) {
	int l = 0, r = nums.length - 1;
	
	while (nums[l] + nums[r] != target) {
		if (nums[l] + nums[r] < target) l++;
		else r--;
	}

	return new int[] {l+1, r+1};
}
}