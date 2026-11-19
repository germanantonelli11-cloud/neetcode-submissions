class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seen = set()
        maxCount = 0
        for num in nums:
            seen.add(num)
        for num in seen:
            count = 0
            if num - 1 not in seen:
                while num in seen:
                    count += 1 
                    num += 1
            maxCount = max(maxCount, count)
        return maxCount