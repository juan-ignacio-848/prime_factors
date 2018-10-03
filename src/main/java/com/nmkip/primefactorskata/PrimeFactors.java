package com.nmkip.primefactorskata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> of(int n) {
        final List<Integer> factors = new ArrayList<>();
        if(n == 2) {
            factors.add(2);
        }

        if(n == 3) {
            factors.add(3);
        }
        return factors;
    }
}
