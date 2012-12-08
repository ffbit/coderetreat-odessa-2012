package com.ffbit.game_of_life;

import java.util.LinkedList;
import java.util.List;

public class PrimeFactory {

    public Integer[] computePrimeDivisors(int n) {
        if (isPrime(n)) {
            return new Integer[] { n };
        }

        List<Integer> result = new LinkedList<Integer>();

        int i = 2;
        while (i <= n) {
            if (isPrime(n)) {
                result.add(n);
                break;
            }
            if (isPrime(i) && n % i == 0) {
                result.add(i);
                n /= i;
                i = 2;
            } else {
                i++;
            }
        }

        return result.toArray(new Integer[] { result.size() });
    }

    public boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
