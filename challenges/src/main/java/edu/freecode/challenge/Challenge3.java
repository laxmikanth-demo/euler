package edu.freecode.challenge;

import java.util.stream.IntStream;

/**
 * Created by myhome on 1/4/20.
 */
public class Challenge3 {
    public Integer compute(Integer factorFor) {
        return IntStream.range(2, factorFor/2)
                .filter(i -> isPrime(i))
                .filter(i -> factorFor % i == 0)
                .max().orElse(factorFor);
    }

    private static boolean isPrime(int number) {
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
}
