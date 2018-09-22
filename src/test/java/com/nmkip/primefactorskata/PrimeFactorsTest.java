package com.nmkip.primefactorskata;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class PrimeFactorsTest {

    @Test
    public void should_return_empty_list_when_n_is_one() {
        PrimeFactors primeFactors = new PrimeFactors();
        assertThat(primeFactors.of(1), is(Lists.emptyList()));
    }

    @Test
    public void should_return_list_2_when_n_is_two() {
        PrimeFactors primeFactors = new PrimeFactors();
        assertThat(primeFactors.of(2), is(Arrays.asList(2)));
    }
}
