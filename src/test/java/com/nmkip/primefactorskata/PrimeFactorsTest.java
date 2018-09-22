package com.nmkip.primefactorskata;

import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class PrimeFactorsTest {

    private PrimeFactors primeFactors;

    @Before
    public void setUp() throws Exception {
        primeFactors = new PrimeFactors();
    }

    @Test
    public void should_return_empty_list_when_n_is_one() {
        assertThat(primeFactors.of(1), is(Lists.emptyList()));
    }

    @Test
    public void should_return_list_2_when_n_is_two() {
        assertThat(primeFactors.of(2), is(Arrays.asList(2)));
    }

}
