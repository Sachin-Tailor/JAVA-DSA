public class SudokuSolver {

    static boolean isSafe(int board[][], int row, int col, int num) {

        for(int i = 0; i < 9; i++) {
            if(board[row][i] == num) return false;
            if(board[i][col] == num) return false;
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for(int i = sr; i < sr + 3; i++) {
            for(int j = sc; j < sc + 3; j++) {
                if(board[i][j] == num) return false;
            }
        }

        return true;
    }

    static boolean solve(int board[][], int row, int col) {

        if(row == 9) return true;

        int nextRow = row, nextCol = col + 1;

        if(col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if(board[row][col] != 0) {
            return solve(board, nextRow, nextCol);
        }

        for(int num = 1; num <= 9; num++) {
            if(isSafe(board, row, col, num)) {
                board[row][col] = num;

                if(solve(board, nextRow, nextCol)) return true;

                board[row][col] = 0; // backtrack
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int board[][] = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };

        if(solve(board, 0, 0)) {
            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution");
        }
    }
}