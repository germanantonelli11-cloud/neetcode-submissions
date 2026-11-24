class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        length = 0
        for i in range(len(fruits)):
            types = set()
            for j in range(i, len(fruits)):
                types.add(fruits[j])
                if len(types) > 2:
                    break
                length = max(length, j - i + 1)
        return length