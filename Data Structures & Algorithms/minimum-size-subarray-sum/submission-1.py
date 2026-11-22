class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        l = 0
        minLength = float('inf')
        total = 0
        for r in range(len(nums)):
            total += nums[r]
            while total >= target:
                total -= nums[l]
                minLength = min(r - l + 1, minLength)
                l += 1
        return minLength if minLength != float('inf') else 0