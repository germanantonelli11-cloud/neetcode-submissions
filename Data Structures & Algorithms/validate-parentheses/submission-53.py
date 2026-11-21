class Solution:
    def isValid(self, s: str) -> bool:
        iteration = len(s) //2
        i = 1
        while i <= iteration:
            s = s.replace('()', '')
            s = s.replace('[]', '')
            s = s.replace('{}', '')
            if s == '':
                return True
            i += 1
        
        return False