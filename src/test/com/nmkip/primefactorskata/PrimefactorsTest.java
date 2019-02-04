package com.nmkip.primefactorskata;

import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimefactorsTest {

    @Test
    public void of_1_should_return_empty_list() {
        assertThat(Primefactors.of(1), is(Collections.emptyList()));
    }

    @Test
    public void of_2_should_return_list_2() {
        assertThat(Primefactors.of(2), is(asList(2)));
    }

    @Test
    public void of_3_should_return_list_3() {
        assertThat(Primefactors.of(3), is(asList(3)));
    }

    @Test
    public void of_5_should_return_list_5() {
        assertThat(Primefactors.of(5), is(asList(5)));
    }

    @Test
    public void of_6_should_return_list_2_3() {
        assertThat(Primefactors.of(6), is(asList(2, 3)));
    }

    @Test
    public void of_15_should_return_list_3_5() {
        assertThat(Primefactors.of(15), is(asList(3, 5)));
    }

    @Test
    public void of_4_should_return_list_2_2() {
        assertThat(Primefactors.of(4), is(asList(2, 2)));
    }

    @Test
    public void of_35490_should_return_list_2_3_5_7_13_13() {
        assertThat(Primefactors.of(35490), is(asList(2, 3, 5, 7, 13, 13)));
    }
}
