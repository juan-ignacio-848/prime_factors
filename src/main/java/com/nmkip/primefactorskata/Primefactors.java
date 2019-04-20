package com.nmkip.primefactorskata;

import java.util.ArrayList;
import java.util.List;

class Primefactors {
    List<Integer> of(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        int divisor = 2;
        while (n > 1) {
            while (divisibleBy(divisor, n)) {
                factors.add(divisor);
                n /= divisor;
            }
            divisor++;
        }

        return factors;
    }

    private boolean divisibleBy(int divisor, int n) {
        return n % divisor == 0;
    }
}
