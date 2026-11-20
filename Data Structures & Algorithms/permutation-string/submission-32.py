class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False
        l = 0
        r = len(s1)
        countS1 = [0] * 26
        countS2 = [0] * 26
 
        for c in range(len(s1)):
            countS1[ord(s1[c]) - ord('a')] += 1
            countS2[ord(s2[c]) - ord('a')] += 1
            print(countS1)
            print(countS2)
        if countS1 == countS2:
            return True
        while r < len(s2):

            countS2[ord(s2[r]) - ord('a')] += 1
            countS2[ord(s2[l]) - ord('a')] -= 1
            print(r, s2[r], countS2)
            r += 1
            l += 1
            if countS1 == countS2:
                return True
        return False

        
        
'''
        for r, char in enumerate(s2):
            if r == range(len(s2)):
                return
                
            while (r - l) > len(s1):
                print(s2[r])
                print(r)
                countS2[ord(s2[r]) - ord('a')] += 1
                countS2[ord(s2[l]) - ord('a')] -= 1
                r += 1
                l -= 1
                for c in countS2:
                    if countS2[c] != countS1[c]:
                        return False
        return True
'''

                
