class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        l = 0
        seen = {}
        for r, num in enumerate(nums):
            if num in seen and abs(r - seen[num]) <= k:
                return True
            seen[num] = r
        return False
        
