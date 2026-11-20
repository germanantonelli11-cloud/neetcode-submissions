class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        key = { '{' : '}', '[' : ']', '(': ')'}
        for c in s:
            if c in key:
                stack.append(c)
            else:
                if stack == [] or key[stack[-1]] not in c:
                    return False
                if key[stack[-1]] == c:
                    stack.pop()

        return stack == []