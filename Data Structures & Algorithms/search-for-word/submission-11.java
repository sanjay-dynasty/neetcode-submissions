class Solution {
    public boolean backtrack(int idx, char[][] board, int i, int j, String word) {
        if (idx == word.length())
            return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == '-')
            return false;

        if (board[i][j] != word.charAt(idx))
            return false;
        char temp = board[i][j];
        board[i][j] = '-';

        boolean found = backtrack(idx + 1, board, i + 1, j, word)
            || backtrack(idx + 1, board, i - 1, j, word)
            || backtrack(idx + 1, board, i, j + 1, word)
            || backtrack(idx + 1, board, i, j - 1, word);
        
        board[i][j] = temp;

        return found;
    }

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0)
            return false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && backtrack(0, board, i, j, word))
                    return true;
            }
        }
        return false;
    }
}
