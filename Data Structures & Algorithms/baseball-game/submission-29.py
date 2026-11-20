class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = []
        key = ['+' , 'C', 'D']
        total = 0
        for i, num in enumerate(operations):
            if operations[i] in key:
                if operations[i] == '+':
                    #addition = int(stack[i - 1]) + int(stack[i -2])
                    addition = stack[-1] + stack[-2]
                    stack.append(addition)
                if num == 'C':
                    stack.pop()
                if num == 'D':
                    #double = int(operations[i - 1]) * 2
                    double = stack[-1] * 2
                    stack.append(double)

            else:
                 stack.append(int(num))
            

        return sum(stack)
