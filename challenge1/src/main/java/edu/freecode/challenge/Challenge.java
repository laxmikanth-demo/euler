package edu.freecode.challenge;

import java.util.stream.IntStream;

/**
 * Created by myhome on 1/4/20.
 */
public class Challenge {

    public Integer compute(Integer number) {
        return IntStream.range(1, number).filter(n -> (n % 3 == 0 || n % 5 == 0)).sum();
    }
}
