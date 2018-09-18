package com.nmkip.primefactorskata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> of(int n) {

        final List<Integer> factors = new ArrayList<>();
        if (n > 1) {
            while (n % 2 == 0) {
                factors.add(2);
                n /= 2;
            }

            while (n % 3 == 0) {
                factors.add(3);
                n /= 3;
            }
        }

        if (n > 1) {
            factors.add(n);
        }

        return factors;
    }

}
