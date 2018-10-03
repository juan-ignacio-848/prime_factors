package com.nmkip.primefactorskata;

import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeFactorsTest {

    private PrimeFactors primeFactors;

    @Before
    public void setUp() {
        primeFactors = new PrimeFactors();
    }

    @Test
    public void of_1_is_empty_list() {
        assertThat(primeFactors.of(1), is(Lists.emptyList()));
    }

    @Test
    public void of_2_is_list_2() {
        assertThat(primeFactors.of(2), is(Arrays.asList(2)));
    }

    @Test
    public void of_3_is_list_3() {
        assertThat(primeFactors.of(3), is(Arrays.asList(3)));
    }

    @Test
    public void of_5_is_list_5() {
        assertThat(primeFactors.of(5), is(Arrays.asList(5)));
    }

}
