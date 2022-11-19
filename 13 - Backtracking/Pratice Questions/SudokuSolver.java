public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                { '9', '5', '7', '.', '1', '3', '.', '8', '4' },
                { '4', '8', '3', '.', '5', '7', '1', '.', '6' },
                { '.', '1', '2', '.', '4', '9', '5', '3', '7' },
                { '1', '7', '.', '3', '.', '4', '9', '.', '2' },
                { '5', '.', '4', '9', '7', '.', '3', '6', '.' },
                { '3', '.', '9', '5', '.', '8', '7', '.', '1' },
                { '8', '4', '5', '7', '9', '.', '6', '1', '3' },
                { '.', '9', '1', '.', '3', '6', '.', '7', '5' },
                { '7', '.', '6', '1', '8', '5', '4', '.', '9' }
        };

        sudokuSolver(board, 0, 0);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
        // printBoard(board);

    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean sudokuSolver(char[][] board, int row, int col) {
        // Base case
        if (row == board.length) {
            return true;
        }

        int NewRow = row, NewCol = col + 1;
        if (col == board.length - 1) {
            NewRow = row + 1;
            NewCol = 0;
        }
        if (board[row][col] != '.') {
            return sudokuSolver(board, NewRow, NewCol);
        }
        // kaam
        for (char ch = '1'; ch <= '9'; ch++) {
            if (issafe(board, row, col, ch)) {
                board[row][col] = ch;
                if (sudokuSolver(board, NewRow, NewCol)) {
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
        }

        return false;
    }

    private static boolean issafe(char[][] board, int row, int col, int ch) {
        // col
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch) {
                return false;
            }

        }
        // row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch) {
                return false;
            }

        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == ch) {
                    return false;
                }

            }
        }

        return true;
    }

}
