public class NQueensCount {

    static int count = 0;

    static boolean isSafe(char board[][], int row, int col) {

        for(int i = row - 1; i >= 0; i--) {
            if(board[i][col] == 'Q') return false;
        }

        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') return false;
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }

    static void solve(char board[][], int row) {
        if(row == board.length) {
            count++;
            return;
        }

        for(int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';

                solve(board, row + 1);

                board[row][j] = '.';
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for(char[] row : board) {
            java.util.Arrays.fill(row, '.');
        }

        solve(board, 0);

        System.out.println("Total ways: " + count);
    }
}