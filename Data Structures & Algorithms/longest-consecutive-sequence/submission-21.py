class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seen = set(nums)
        maxLength = 0
        for num in seen:
            count = 0
            if num - 1 not in seen:
                while num in seen:
                    count += 1
                    num += 1
            maxLength = max(count, maxLength)
        return maxLength