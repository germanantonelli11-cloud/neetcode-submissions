class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seen = set(nums)
        maxLength = 0
        for num in seen:
            if num - 1 not in seen:
                count = 1
                while num + count in seen:
                    count += 1
                maxLength = max(count, maxLength)
        return maxLength