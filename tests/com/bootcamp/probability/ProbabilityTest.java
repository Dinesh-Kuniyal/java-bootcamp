package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void invalidProbability() {
        assertThrows(Exception.class, () -> {
            Probability.createProbability(1.1);
        }, "should throw an error if given impossibility");

        assertThrows(Exception.class, () -> {
            Probability.createProbability(-1);
        }, "should throw an error if given certainty");
    }

    @Test
    void gettingChancesTailsComplimentOneCoin() throws Exception {
        Probability chancesOfGettingTailComplement = Probability.createProbability(0.5);

        assertEquals(Probability.createProbability(0.5).compliment(), chancesOfGettingTailComplement);
    }

    @Test
    void gettingChancesTailsComplementTwoCoin() throws Exception {
        Probability chancesOfGettingTailsComplementOnTwoCoins = Probability.createProbability(0.25);
        Probability expected = Probability.createProbability(0.75);

        assertEquals(chancesOfGettingTailsComplementOnTwoCoins.compliment(), expected);
    }

    @Test
    void andProbability() throws Exception {
        Probability first = Probability.createProbability(0.5);
        Probability second = Probability.createProbability(0.5);

        assertEquals(first.and(second), Probability.createProbability(0.25));
    }

    @Test
    void orProbability() throws Exception {
        Probability first = Probability.createProbability(0.8);
        Probability second = Probability.createProbability(0.8);

        assertEquals(first.or(second), Probability.createProbability(0.96));
    }
}