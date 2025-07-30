/*
 Write a program to solve a Sudoku puzzle by filling the empty cells.
    A sudoku solution must satisfy all of the following rules:
        Each of the digits 1-9 must occur exactly once in each row.
        Each of the digits 1-9 must occur exactly once in each column.
        Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
    The '.' character indicates empty cells.
 */
class Solution {

    // Check if placing the number is valid
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Check row and column
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == (char) (number + '0') || board[i][col] == (char) (number + '0')) {
                return false;
            }
        }

        // Check 3x3 sub-grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    // Recursive backtracking function
    public boolean helper(char[][] board, int row, int col) {
        // Base condition: If all rows are processed, Sudoku is solved
        if (row == board.length) {
            return true;
        }

        // Determine next row and column
        int nextRow = (col == board.length - 1) ? row + 1 : row;
        int nextCol = (col == board.length - 1) ? 0 : col + 1;

        // If cell is already filled, move to the next cell
        if (board[row][col] != '.') {
            return helper(board, nextRow, nextCol);
        }

        // Try placing numbers 1 to 9
        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {
                board[row][col] = (char) (i + '0'); // Place the number
                if (helper(board, nextRow, nextCol)) {
                    return true; // If solution is found, return true
                }
                board[row][col] = '.'; // Backtrack
            }
        }

        return false; // If no number can be placed, return false
    }

    // Main function to solve Sudoku
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] args) {
        // Example Sudoku puzzle
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Solution solution = new Solution();
        solution.solveSudoku(board);

        // Print the solved Sudoku board
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
