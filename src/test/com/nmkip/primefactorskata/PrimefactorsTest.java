package com.nmkip.primefactorskata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class PrimefactorsTest {

    private Primefactors primefactors;

    @BeforeEach
    void setUp() {
        primefactors = new Primefactors();
    }

    @Test
    void of_1_has_no_primefactors() {
        assertThat(primefactors.of(1), is(Collections.EMPTY_LIST));
    }

    @Test
    void of_2_is_2() {
        assertThat(primefactors.of(2), is(List.of(2)));
    }

    @Test
    void of_3_is_3() {
        assertThat(primefactors.of(3), is(List.of(3)));
    }

    @Test
    void of_4_is_2_2() {
        assertThat(primefactors.of(4), is(List.of(2, 2)));
    }

    @Test
    void of_5_is_5() {
        assertThat(primefactors.of(5), is(List.of(5)));
    }

    @Test
    void of_6_is_3_3() {
        assertThat(primefactors.of(6), is(List.of(2, 3)));
    }

    @Test
    void of_8_is_2_2_2() {
        assertThat(primefactors.of(8), is(List.of(2, 2, 2)));
    }

    @Test
    void of_9_is_3_3() {
        assertThat(primefactors.of(9), is(List.of(3, 3)));
    }

    @Test
    void of_27_is_3_3_3() {
        assertThat(primefactors.of(27), is(List.of(3, 3, 3)));
    }

    @Test
    void big_number() {
        assertThat(primefactors.of(2 * 2 * 3 * 5 * 7 * 11 * 13 * 13), is(List.of(2, 2, 3, 5, 7, 11, 13, 13)));
    }
}
