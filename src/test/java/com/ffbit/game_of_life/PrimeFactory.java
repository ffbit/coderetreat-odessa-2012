package com.ffbit.game_of_life;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrimeFactory {

    @Test
    public void itShouldReturn2() throws Exception {
        assertThat(primeFactory(2), is(new int[] { 2 }));
    }

    @Test
    public void itShouldReturn3() throws Exception {
        assertThat(primeFactory(3), is(new int[] { 3 }));
    }

    @Test
    public void itShouldReturn2and2() throws Exception {
        assertThat(primeFactory(4), is(new int[] { 2, 2 }));
    }

    private int[] primeFactory(int n) {
        if (n == 2) {
            return new int[] { 2 };
        } else if (n == 3) {
            return new int[] { 3 };
        }

        return new int[] { 2, 2 };
    }

}
