package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int ind = 0; ind < board.length; ind++) {
            if ( board[row][ind] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
