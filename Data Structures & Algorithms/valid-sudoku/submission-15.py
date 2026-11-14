class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        row = defaultdict(set)
        col = defaultdict(set)
        box = defaultdict(set)

        for r in range(9):
            for c in range(9):
                digit = board[r][c]

                if digit == ".":
                    continue

                b = (r // 3) * 3 + c // 3

                if digit in row[r] or digit in col[c] or digit in box[b]:
                    return False

                row[r].add(digit)
                col[c].add(digit)
                box[b].add(digit)
        
        return True