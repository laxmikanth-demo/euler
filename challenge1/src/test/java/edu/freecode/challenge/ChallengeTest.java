package edu.freecode.challenge;

import org.junit.jupiter.api.Test;

/**
 * Created by myhome on 1/4/20.
 */
public class ChallengeTest {
    Challenge challenge = new Challenge();

    @Test
    public void scenario1() {
        Integer result = challenge.compute(1000);
        assert(result == 233168);
    }

    @Test
    public void scenario2() {
        Integer result = challenge.compute(49);
        assert(result == 543);
    }

    @Test
    public void scenario3() {
        Integer result = challenge.compute(19564);
        assert(result == 89301183);
    }

    @Test
    public void scenario4() {
        Integer result = challenge.compute(8456);
        assert(result == 16687353);
    }
}
