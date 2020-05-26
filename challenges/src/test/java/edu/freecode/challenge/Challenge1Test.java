package edu.freecode.challenge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by myhome on 1/4/20.
 */
public class Challenge1Test {
    @Test
    public void scenarios() {
        assertAll(
                () -> assertEquals(233168, new Challenge1().compute(1000)),
                () -> assertEquals(543, new Challenge1().compute(49)),
                () -> assertEquals(89301183, new Challenge1().compute(19564)),
                () -> assertEquals(16687353, new Challenge1().compute(8456))
        );
    }
}
