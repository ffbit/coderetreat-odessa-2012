package com.ffbit.game_of_life;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MinesweeperTest {

    private Minesweeper minesweeper;

    @Before
    public void setUp() throws Exception {
        minesweeper = new Minesweeper();
    }

    @Test
    public void itShouldReturn2x2FieldWithoutMines() throws Exception {
        char[][] source = { { '.', '.' }, { '.', '.' }};
        char[][] expected = { { '0', '0' }, { '0', '0' }};

        assertThat(minesweeper.makeMap(source), is(expected));
    }

    @Test
    public void itShouldReturn3x3FieldWithoutMines() throws Exception {
        char[][] source = { { '.', '.', '.' }, { '.', '.', '.' } };
        char[][] expected = { { '0', '0', '0' }, { '0', '0', '0' } };

        assertThat(minesweeper.makeMap(source), is(expected));
    }

    @Test
    public void itShouldReturn3x3FieldWithAllMines() throws Exception {
        char[][] source = { { '*', '*', '*' }, { '*', '*', '*' } };
        char[][] expected = { { '*', '*', '*' }, { '*', '*', '*' } };

        assertThat(minesweeper.makeMap(source), is(expected));
    }

    @Test
    public void itShouldReturnFieldWithOneMine() throws Exception {
        char[][] source = { { '*', '.' }, { '.', '.' } };
        char[][] expected = { { '*', '1' }, { '1', '1' } };

        assertThat(minesweeper.makeMap(source), is(expected));
    }

    @Test
    public void itShouldTestExampleMap() throws Exception {
        char[][] source = { { '*', '.', '.', '.' }, { '.', '.', '.', '.' },
                { '.', '*', '.', '.' }, { '.', '.', '.', '.' } };
        char[][] expected = { { '*', '1', '0', '0' }, { '2', '2', '1', '0' },
                { '1', '*', '1', '0' }, { '1', '1', '1', '0' } };

        assertThat(minesweeper.makeMap(source), is(expected));
    }

}
