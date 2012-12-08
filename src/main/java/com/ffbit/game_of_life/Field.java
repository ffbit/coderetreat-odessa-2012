package com.ffbit.game_of_life;


public class Field {

    private boolean[][] field;

    public Field(int n) {
        field = new boolean[n][n];
    }

    public void setLive(int i, int j) {
        field[i][j] = true;
    }

    public boolean isAlive(int i, int j) {
        int aliveNeighbours = traverseNeighbours(i, j);

        return aliveNeighbours == 2 || aliveNeighbours == 3;
    }

    private int traverseNeighbours(int i, int j) {
        int count = 0;
        for (int ii = i - 1; ii <= i + 1; ii++) {
            for (int jj = j - 1; jj <= j + 1; jj++) {
                if (i == ii && j == jj) {
                    continue;
                }

                if (field[ii][jj]) {
                    count++;
                }
            }
        }

        return count;
    }

}
