package edu.freecode.challenge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by myhome on 1/4/20.
 */
public class Challenge2Test {

    @Test
    public void scenarios() {
        assertAll(
                () -> assertEquals(44, (new Challenge2().compute(10))),
                () -> assertEquals(3382, (new Challenge2().compute(18))),
                () -> assertEquals(60696, (new Challenge2().compute(23))),
                () -> assertEquals(350704366, (new Challenge2().compute(43)))
        );
    }
}
