package com.nmkip.primefactorskata;

import org.assertj.core.util.Lists;
import org.junit.Test;


import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeFactorsTest {

    @Test
    public void of_1_isEmptyList() {
        assertThat(PrimeFactors.of(1), is(Lists.emptyList()));
    }

    @Test
    public void of_2_is2() {
        assertThat(PrimeFactors.of(2), is(Arrays.asList(2)));
    }

    @Test
    public void of_3_is3() {
        assertThat(PrimeFactors.of(3), is(Arrays.asList(3)));
    }

    @Test
    public void of_4_is2_2() {
        assertThat(PrimeFactors.of(4), is(Arrays.asList(2, 2)));
    }

    @Test
    public void of_8_is_2_2_2() {
        assertThat(PrimeFactors.of(8), is(Arrays.asList(2, 2, 2)));
    }

    @Test
    public void of_9_is_3_3() {
        assertThat(PrimeFactors.of(9), is(Arrays.asList(3, 3)));
    }

    @Test
    public void of_acceptanceTest() {
        assertThat(PrimeFactors.of(2 * 3 * 5 * 7 * 7 * 7 * 11 * 19), is(Arrays.asList(2, 3, 5, 7, 7, 7, 11, 19)));
    }
}
