package part00;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (nothing to watch in part 00 — this is the course we follow for 20 parts)

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".

class ChallengeTest {

    @Test
    void greetingJordan() {
        assertEquals("Hello, Jordan!", Challenge.greeting("Jordan"));
    }

    @Test
    void greetingSam() {
        assertEquals("Hello, Sam!", Challenge.greeting("Sam"));
    }
}
