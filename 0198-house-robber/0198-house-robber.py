class Solution(object):
    def rob(self, nums):
        if not nums:
            return 0
        if len(nums) == 1:
            return nums[0]

        past_sum, sum = 0, 0

        for num in nums:
            temp = sum
            sum = max(sum, past_sum + num)
            past_sum = temp

        return sum