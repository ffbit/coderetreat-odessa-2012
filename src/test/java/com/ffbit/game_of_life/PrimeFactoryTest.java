package com.ffbit.game_of_life;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PrimeFactoryTest {

    private PrimeFactory primeFactory;

    @Before
    public void setUp() throws Exception {
        primeFactory = new PrimeFactory();
    }

    @Test
    public void itShouldReturn2() throws Exception {
        assertThat(primeFactory.computePrimeDivisors(2), is(new int[] { 2 }));
    }

    @Test
    public void itShouldReturn3() throws Exception {
        assertThat(primeFactory.computePrimeDivisors(3), is(new int[] { 3 }));
    }

    @Test
    public void itShouldReturn2and2() throws Exception {
        assertThat(primeFactory.computePrimeDivisors(4), is(new int[] { 2, 2 }));
    }

    @Test
    public void itShouldReturn2and2and2for8() throws Exception {
        assertThat(primeFactory.computePrimeDivisors(8),
                is(new int[] { 2, 2, 2 }));
    }

    @Test
    public void itShouldReturn5() throws Exception {
        assertThat(primeFactory.computePrimeDivisors(5), is(new int[] { 5 }));
    }

    @Test
    public void twoShouldBePrime() throws Exception {
        assertTrue(primeFactory.isPrime(2));
    }

    @Test
    public void threeShouldBePrime() throws Exception {
        assertTrue(primeFactory.isPrime(3));
    }

    @Test
    public void fourShouldBePrime() throws Exception {
        assertFalse(primeFactory.isPrime(4));
    }

    @Test
    public void itShouldReturn256() throws Exception {
        assertThat(primeFactory.computePrimeDivisors(256), is(new int[] { 2, 2,
                2, 2, 2, 2, 2, 2, }));
    }

}
