package com.nmkip.primefactorskata;

import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PrimeFactorsTest {

    private PrimeFactors primeFactors;

    @Before
    public void setUp() throws Exception {
        primeFactors = new PrimeFactors();
    }

    @Test
    public void of_1_returns_empty_list() {
        assertThat(primeFactors.of(1)).isEqualTo(Lists.emptyList());
    }

    @Test
    public void of_2_returns_list_2() {
        assertThat(primeFactors.of(2)).isEqualTo(Arrays.asList(2));
    }

}
