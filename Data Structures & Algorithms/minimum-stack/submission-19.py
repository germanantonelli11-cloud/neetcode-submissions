class MinStack:

    def __init__(self):
        self.stack = []
        self.min = [float('inf')]


    def push(self, val: int) -> None:
        self.stack.append(val)
        #print(self.stack)
        if self.stack[-1] <= self.min[-1]:
            self.min.append(self.stack[-1])
            #print(self.min)

    def pop(self) -> None:

        if self.stack[-1] == self.min[-1]:
            self.min.pop()
        self.stack.pop()


        

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.min[-1]
