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


    @Test
    public void of_3_returns_list_3() {
        assertThat(primeFactors.of(3)).isEqualTo(Arrays.asList(3));
    }

    @Test
    public void of_4_returns_list_2_2() {
        assertThat(primeFactors.of(4)).isEqualTo(Arrays.asList(2, 2));
    }

    @Test
    public void of_5_returns_list_5() {
        assertThat(primeFactors.of(5)).isEqualTo(Arrays.asList(5));
    }

    @Test
    public void of_6_returns_list_2_3() {
        assertThat(primeFactors.of(6)).isEqualTo(Arrays.asList(2, 3));
    }

    @Test
    public void of_8_returns_list_2_2_2() {
        assertThat(primeFactors.of(8)).isEqualTo(Arrays.asList(2, 2, 2));
    }

    @Test
    public void of_9_returns_list_3_3() {
        assertThat(primeFactors.of(9)).isEqualTo(Arrays.asList(3, 3));
    }
}
