package com.nmkip.primefactorskata;

import org.assertj.core.util.Lists;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PrimeFactorsTest {

    @Test
    public void of_1_returns_empty_list() {
        PrimeFactors primeFactors = new PrimeFactors();
        assertThat(primeFactors.of(1)).isEqualTo(Lists.emptyList());
    }
}
