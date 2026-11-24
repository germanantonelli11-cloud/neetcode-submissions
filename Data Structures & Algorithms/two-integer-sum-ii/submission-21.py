class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        l, r = 0, len(numbers) - 1
        total = 0
        seen = {}
        
        while l < r:
            total = numbers[r] + numbers[l]
            if total == target:
                return [l + 1, r + 1]
            if total > target:
                r -= 1
            if total < target:
                l += 1
        return []



'''
        for i, num in enumerate(numbers):
            diff = target - num
            if diff in seen: 
                return [i -1, seen[diff]]
            seen[i] = diff
        return[]

        for r in range(len(numbers)):
            total = numbers[r] + numbers[l]
            if total == target:
                return [l + 1, r + 1]
            if r == len(numbers) - 1:
                while l < len(numbers):
                    total = numbers[r] + numbers[l]
                    if total == target:
                        return [l + 1, r + 1]
                    l += 1
        return []
'''
                