class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        res = 0
        for i in range(len(fruits)):
            types = set()
            j = i
            while j < len(fruits) and (len(types) < 2 or fruits[j] in types):
                types.add(fruits[j])
                j+= 1

            res = max(res, j - i)
        return res