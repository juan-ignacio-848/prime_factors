package com.nmkip.primefactorskata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> of(int n) {
        final ArrayList<Integer> factors = new ArrayList<>();

        int divisor = 2;
        while(n > 1) {
            while(n % divisor == 0) {
                factors.add(divisor);
                n /= divisor;
            }
            divisor ++;
        }

        return factors;
    }
}
