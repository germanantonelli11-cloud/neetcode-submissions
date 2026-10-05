class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++) {                 
            HashMap<Character, Integer> row = new HashMap<>();
            for(int j = 0; j < board[i].length; j++) {
                char currentChar = board[i][j];
                if (currentChar == '.') {
                    continue;
                }
                if (row.containsKey(currentChar)) {
                    return false;
                }
                row.put(currentChar, 1);

            }

        }

        for(int i = 0; i < board.length; i++) {                 
            HashMap<Character, Integer> col = new HashMap<>();
            for(int j = 0; j < board.length; j++) {
                char currentChar = board[j][i];
                if (currentChar == '.') {
                    continue;
                }
                if (col.containsKey(currentChar)) {
                    return false;
                }
                col.put(currentChar, 1);

            }

        }

        for (int i = 0; i < board.length; i += 3) {
            
            for (int j = 0; j < board.length; j += 3){
                HashMap<Character, Integer> square = new HashMap<>();
                for (int r = i; r < i + 3; r++) {
                    for (int c = j; c < j + 3; c++) {
                        char currentChar = board[r][c];
                        if (currentChar == '.') {
                            continue;
                        }
                        if(square.containsKey(currentChar)) {
                            return false;
                        }
                        square.put(currentChar, 1);
                        }   
                }
            }
        } 

        return true;
    }
}
