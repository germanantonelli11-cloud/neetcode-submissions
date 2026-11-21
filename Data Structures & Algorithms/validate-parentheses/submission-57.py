class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        key = { '(' : ')', '[' : ']', '{' : '}'}
        for c in s:
            if c in key:
                stack.append(c)
            else:
                if stack == [] or key[stack[-1]] not in c:
                    return False
                stack.pop()
        return stack == []

        '''
        iteration = len(s) //2
        i = 1
        while i <= iteration:
            before = len(s)
            s = s.replace('()', '')
            s = s.replace('[]', '')
            s = s.replace('{}', '')
            if s == '':
                return True
            if len(s) == before:
                return False
            i += 1
        
        return False
        '''