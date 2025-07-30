import java.util.*;

public class Queens {

    // Check if placing a queen at (row, col) is safe
    public boolean isSafe(int row, int col, char[][] board) {
        int n = board.length;

        // Check the current column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Save the current board configuration
    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (char[] row : board) {
            newBoard.add(new String(row));
        }
        allBoards.add(newBoard);
    }

    // Recursive helper method to solve N-Queens
    public void solve(int row, char[][] board, List<List<String>> allBoards) {
        int n = board.length;

        // Base case: all queens are placed
        if (row == n) {
            saveBoard(board, allBoards);
            return;
        }

        // Try placing a queen in each column of the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q'; // Place the queen
                solve(row + 1, board, allBoards);
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    // Solve the N-Queens problem
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        solve(0, board, allBoards);
        return allBoards;
    }

    public static void main(String[] args) {
        Queens queens = new Queens();
        int n = 4; // Example input
        List<List<String>> solutions = queens.solveNQueens(n);

        // Print solutions
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
