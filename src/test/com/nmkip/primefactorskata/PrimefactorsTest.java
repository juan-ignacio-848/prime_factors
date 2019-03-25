package com.nmkip.primefactorskata;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class PrimefactorsTest {

    private Primefactors primefactors;

    @Before
    public void setUp() {
        primefactors = new Primefactors();
    }

    @Test
    public void of_1_is_empty() {
        assertThat(primefactors.of(1), is(Collections.EMPTY_LIST));
    }

    @Test
    public void of_2_is_2() {
        assertThat(primefactors.of(2), is(asList(2)));
    }

    @Test
    public void of_3_is_3() {
        assertThat(primefactors.of(3), is(asList(3)));
    }

    @Test
    public void of_4_is_2_2() {
        assertThat(primefactors.of(4), is(asList(2, 2)));
    }

    @Test
    public void of_9_is_2_3() {
        assertThat(primefactors.of(9), is(asList(3, 3)));
    }

    @Test
    public void of_25_is_5_5() {
        assertThat(primefactors.of(25), is(asList(5, 5)));
    }

    @Test
    public void of_8_is_2_2_2() {
        assertThat(primefactors.of(8), is(asList(2, 2, 2)));
    }

    @Test
    public void of_2x2x3x5x11x13_is_2_2_3_5_11_13() {
        assertThat(primefactors.of(2 * 2 * 3 * 5 * 11 * 13), is(asList(2, 2, 3, 5, 11, 13)));
    }
}
