class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int val = board[i][j] - '0';
                    int block = (i / 3 * 3) + j / 3;

                    int rowKey = val * 10 + i;
                    int colKey = val * 100 + j;
                    int blockKey = val * 1000 + block;

                    if (!set.add(rowKey) || !set.add(colKey) || !set.add(blockKey))
                        return false;
                }
            }
        }
        return true;
    }
}
