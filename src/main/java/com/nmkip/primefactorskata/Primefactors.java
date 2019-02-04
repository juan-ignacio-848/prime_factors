package com.nmkip.primefactorskata;

import java.util.ArrayList;
import java.util.List;

class Primefactors {

    static List<Integer> of(int n) {

        List<Integer> factors = new ArrayList<>();

        int divisor = 2;
        while (n >= divisor) {
            while (n % divisor == 0) {
                factors.add(divisor);
                n /= divisor;
            }
            divisor++;
        }

        return factors;
    }
}
