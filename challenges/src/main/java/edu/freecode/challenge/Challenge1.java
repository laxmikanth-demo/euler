package edu.freecode.challenge;

import java.util.stream.IntStream;

/**
 * Regarding challenge details
 * https://www.freecodecamp.org/learn/coding-interview-prep/project-euler/problem-1-multiples-of-3-and-5
 */
public class Challenge1 {

    public Integer compute(Integer number) {
        return IntStream.range(1, number).filter(n -> (n % 3 == 0 || n % 5 == 0)).sum();
    }
}
