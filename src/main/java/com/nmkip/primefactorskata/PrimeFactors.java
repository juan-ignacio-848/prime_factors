package com.nmkip.primefactorskata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> of(int n) {
        final ArrayList<Integer> factors = new ArrayList<>();

        while(n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        if(n == 3) {
            factors.add(3);
        }

        return factors;
    }
}
