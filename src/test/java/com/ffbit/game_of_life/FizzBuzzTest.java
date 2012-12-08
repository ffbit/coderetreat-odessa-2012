package com.ffbit.game_of_life;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {

    private String fizzbuzz(int i) {
        String fizz = "fizz";
        String buzz = "buzz";

        if (i % 15 == 0) {
            return fizz + buzz;
        } else if (i % 3 == 0) {
            return fizz;
        } else if (i % 5 == 0) {
            return buzz;
        }

        return String.valueOf(i);
    }

    @Test
    public void itShouldReturnIntegerStrign() throws Exception {
        assertThat(fizzbuzz(1), is("1"));
    }

    @Test
    public void itShouldReturnFizz() throws Exception {
        assertThat(fizzbuzz(3), is("fizz"));
    }

    @Test
    public void itShouldReturnBuzz() throws Exception {
        assertThat(fizzbuzz(5), is("buzz"));
    }

    @Test
    public void itShouldReturnFizzBuzz() throws Exception {
        assertThat(fizzbuzz(15), is("fizzbuzz"));
    }

}
