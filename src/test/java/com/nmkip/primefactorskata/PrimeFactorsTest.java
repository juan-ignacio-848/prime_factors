package com.nmkip.primefactorskata;

import org.assertj.core.util.Lists;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class PrimeFactorsTest {

    @Test
    public void of_1_isEmptyList() {
        assertThat(PrimeFactors.of(1), is(Lists.emptyList()));
    }
}
