package com.ffbit.game_of_life;


public class Minesweeper {
    private char[] cash = { '0', '1', '2', '3', '4', '5', '6', '7', '8' };

    public char[][] makeMap(char[][] source) {
        int rows = source.length;
        int cols = source[0].length;
        char[][] map = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char current = source[row][col];

                if (current == '*') {
                    map[row][col] = '*';
                } else {
                    map[row][col] = traverse(source, row, col);
                }
            }
        }

        return map;
    }

    private char traverse(char[][] source, int row, int col) {
        int rows = source.length;
        int cols = source[0].length;
        int counter = 0;

        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    if (source[r][c] == '*') {
                        counter++;
                    }
                }
            }
        }

        return cash[counter];
    }

}
