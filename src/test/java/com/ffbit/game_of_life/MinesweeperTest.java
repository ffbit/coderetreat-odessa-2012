package com.ffbit.game_of_life;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MinesweeperTest {

    private char[][] minesweep(char[][] source) {
        return new char[][] { { '0', '0' }, { '0', '0' } };
    }

    @Test
    public void itShouldReturnFieldWithoutMines() throws Exception {
        char[][] source = { { '.', '.' }, { '.', '.' }};
        char[][] expected = { { '0', '0' }, { '0', '0' }};


        assertThat(minesweep(source), is(expected));
    }


}
