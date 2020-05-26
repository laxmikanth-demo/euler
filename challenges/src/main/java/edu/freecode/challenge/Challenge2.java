package edu.freecode.challenge;

import java.util.stream.Stream;

/**
 * About the problem statement refer
 * https://www.freecodecamp.org/learn/coding-interview-prep/project-euler/problem-2-even-fibonacci-numbers
 *
 * Sample tech references
 * https://dzone.com/articles/the-observer-pattern-using-modern-java
 */
public class Challenge2 {
    public Integer compute(Integer series) {
        return Stream.iterate(new Integer[]{new Integer(1), new Integer(2)}, t -> new Integer[]{t[1], t[0] + t[1]})
                .limit(series)
                .filter(n -> n[0] % 2 == 0)
                .map(n -> n[0])
                .reduce((a, b) -> a + b).orElse(0);
    }
}
