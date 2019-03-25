package com.nmkip.primefactorskata;

import java.util.ArrayList;
import java.util.List;

class Primefactors {

    List<Integer> of(int n) {
        List<Integer> factors = new ArrayList<>();

        int factor = 2;
        while (n > 1) {
            if (isDivisible(n, factor)) {
                factors.add(factor);
                n /= factor;
            } else {
                factor++;
            }
        }

        return factors;
    }

    private boolean isDivisible(int n, int byFactor) {
        return n % byFactor == 0;
    }
}
