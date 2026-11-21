class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        length = 0
        maxLength = 0
        seen = set()
        for r in range(len(s)):
            '''if s[r] not in seen:
                length += 1
                maxLength = max(maxLength, length)'''
            
                
            while s[r] in seen:
                seen.remove(s[l])
                l += 1
                length = r - l + 1

            #length = 1
            #if s[r] in seen:
             #   length= max(length, r - l + 1)
              #  length = 0
               # l += 1    
            seen.add(s[r])
            #print(seen, length)
            #print(l, r, s[l:r+1])
            maxLength = max(maxLength, r - l + 1)
        return maxLength