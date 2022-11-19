public class NQueensCountWays {
    static int count = 0;
    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }

        nQueensAllWays(board, 0);
        System.out.println(count);
    }

    private static void nQueensAllWays(char[][] board, int row) {
        if (row == board.length) {
            count++;
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (issafe(row, col, board)) {
                board[row][col] = 'Q';
                nQueensAllWays(board, row + 1);
                board[row][col] = 'X';
            }
        }
    }

    private static boolean issafe(int row, int col, char[][] board) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }
}
