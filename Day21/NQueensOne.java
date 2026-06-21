public class NQueensOne {

    static boolean isSafe(char board[][], int row, int col) {

        // vertical
        for(int i = row - 1; i >= 0; i--) {
            if(board[i][col] == 'Q') return false;
        }

        // left diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') return false;
        }

        // right diagonal
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }

    static boolean solve(char board[][], int row) {
        if(row == board.length) {
            return true;
        }

        for(int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';

                if(solve(board, row + 1)) return true;

                board[row][j] = '.'; // backtrack
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(board, 0);

        for(char row[] : board) {
            for(char c : row) System.out.print(c + " ");
            System.out.println();
        }
    }
}