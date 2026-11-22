class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seen = set()                        #initialize set
        maxCount = 0                        #initialize max
        for num in nums:                    # add numbers from the list to 
            seen.add(num)                   # set
        for num in seen:                    # for loop
            count = 0
            if num - 1 not in seen:
                while num in seen:
                    count += 1 
                    num += 1
            maxCount = max(maxCount, count)
        return maxCount

