// LeetCode Problem: Valid Sudoku
// Title: Valid Sudoku
// // This problem is about determining if a given 9x9 Sudoku board is valid. A valid Sudoku board must satisfy the following conditions:
// 1. Each row must contain the digits 1-9 without repetition.
// 2. Each column must contain the digits 1-9 without repetition.
// 3. Each of the nine 3x3 sub-boxes must contain the digits 1-9 without repetition.
// Example 1:
// Input: board = [["5","3",".",".","7",".",".",".","."],
//                ["6",".",".","1","9","5",".",".","."],
//                [".","9","8",".",".",".",".","6","."],
//                ["8",".",".",".","6",".",".",".","3"],
//                ["4",".",".","8",".","3",".",".","1"],
//                ["7",".",".",".","2",".",".",".","6"],
//                [".","6",".",".",".",".","2","8","."],
//                [".",".",".","4","1","9",".",".","5"],
//                [".",".",".",".","8",".",".","7","9"]]
// Output: true
// Time Complexity: O(n2) since the board size is fixed at 9x9.
//Space Complexity: O(n) since we are using a fixed amount of space for tracking rows, columns, and squares.
public class ValidSudoku {

        public boolean isValidSudoku(char[][] board) {
            int[] rows = new int[9];
            int[] cols = new int[9];
            int[] squares = new int[9];
    
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    if (board[r][c] == '.') continue;
    
                    int val = board[r][c] - '1';
    
                    if ((rows[r] & (1 << val)) > 0 || (cols[c] & (1 << val)) > 0 ||
                        (squares[(r / 3) * 3 + (c / 3)] & (1 << val)) > 0) {
                        return false;
                    }
    
                    rows[r] |= (1 << val);
                    cols[c] |= (1 << val);
                    squares[(r / 3) * 3 + (c / 3)] |= (1 << val);
                }
            }
            return true;
        }
    }
