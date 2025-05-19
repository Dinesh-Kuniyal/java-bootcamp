package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void gettingChances() {
        Probability coin = new Probability(1, 2);
        assertEquals(0.5, coin.gettingChances());
    }

    @Test
    void notGettingChances() {
        Probability coin = new Probability(1, 2);
        assertEquals(0.5, coin.notGettingChances());
    }
}