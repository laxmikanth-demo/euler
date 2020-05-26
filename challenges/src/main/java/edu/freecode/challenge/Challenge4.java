package edu.freecode.challenge;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by myhome on 1/5/20.
 */
public class Challenge4 {
//    public void compute(Integer limit) {
//        IntStream.range(99, 10)
//                .map(n -> {
//                    IntStream.iterate(n, )
//                });
//        System.out.println(getMax(limit));
//    }

    private Integer getMax(Integer limit) {
        return Stream.iterate(10, i -> i * 10)
                .limit(limit)
                .reduce((f, l) -> l - 1).orElse(limit);
    }

    public static void main(String a[]) {
        Challenge4 challenge = new Challenge4();
        //challenge.compute(3);
    }
}
