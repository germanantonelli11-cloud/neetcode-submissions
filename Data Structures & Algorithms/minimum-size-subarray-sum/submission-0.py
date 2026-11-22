class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        l = 0
        minLength = float('inf')
        total = 0

        for r in range(len(nums)):
            #while total < target:
            total += nums[r]
            #print(len(nums), r, range(len(nums)), total)
            #if r == len(nums) - 1 and total < target:
                #return 0
            #if total == target:
                #return r - l + 1

            #while total > target:
                #total -= nums[l]
            while total >= target:
                total -= nums[l]
                ##if total < target:
                    #return r - l + 1

                #print(r - l + 1, minLength, l, r)
                minLength = min(r - l + 1, minLength)
                l += 1
        
        
            

        return minLength if minLength != float('inf') else 0
                

        #while total < target:
            #total += nums[r]