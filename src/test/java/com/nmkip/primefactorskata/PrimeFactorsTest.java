package com.nmkip.primefactorskata;

import org.assertj.core.util.Lists;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class PrimeFactorsTest {

    @Test
    public void should_return_empty_list_when_n_is_one() {
        PrimeFactors primeFactors = new PrimeFactors();
        assertThat(primeFactors.of(1), is(Lists.emptyList()));
    }
}
