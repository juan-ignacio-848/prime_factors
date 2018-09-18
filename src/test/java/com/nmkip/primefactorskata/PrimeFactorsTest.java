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
}
