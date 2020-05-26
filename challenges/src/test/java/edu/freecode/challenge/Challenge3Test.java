package edu.freecode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by myhome on 1/4/20.
 */
public class Challenge3Test {
    @Test
    public void scenarios() {
        assertAll(
                () -> assertEquals(2, (new Challenge3().compute(2))),
                () -> assertEquals(3, (new Challenge3().compute(3))),
                () -> assertEquals(5, (new Challenge3().compute(5))),
                () -> assertEquals(7, (new Challenge3().compute(7))),
                () -> assertEquals(29, (new Challenge3().compute(13195)))
        );
    }
}
