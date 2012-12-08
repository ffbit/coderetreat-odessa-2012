package com.ffbit.game_of_life;

public class Minesweeper {

    public char[][] makeMap(char[][] source) {
        int rows = source.length;
        int cols = source[0].length;
        char[][] map = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                map[row][col] = '0';
            }
        }

        return map;
    }

}
