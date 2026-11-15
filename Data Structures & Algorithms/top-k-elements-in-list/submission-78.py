class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}

        for n in nums:
            count[n] = count.get(n, 0) + 1
        arr = []

        for freq, num in count.items():
            arr.append([num,freq])

        arr.sort(reverse=True)
        res = []

        for i in range(k):
            res.append(arr[i][1])
        return res