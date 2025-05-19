package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void invalidProbability() {
        assertThrows(Exception.class, ()-> {
            Probability.createProbability(1.1);
        }, "should throw an error if given invalid chance");
    }

    @Test
    void gettingChancesTailsOneCoin() throws Exception {
        Probability actual = Probability.createProbability(0.5);

        assertInstanceOf(Probability.class, actual);
    }

    @Test
    void gettingChancesTailsComplimentOneCoin() throws Exception {
        Probability expected = Probability.createProbability(0.5);

        assertEquals(Probability.createProbability(0.5).compliment(), expected);
    }

    @Test
    void gettingChancesTailsTwoCoin() throws Exception {
        Probability actual = Probability.createProbability(0.25);

        assertInstanceOf(Probability.class, actual);
    }

    @Test
    void gettingChancesTailsComplementTwoCoin() throws Exception {
        Probability coinProbability = Probability.createProbability(0.25);
        Probability expected = Probability.createProbability(0.75);

        assertEquals(coinProbability.compliment(), expected);
    }

    @Test
    void andProbability() throws Exception {
        Probability first = Probability.createProbability(0.5);
        Probability second = Probability.createProbability(0.5);

        assertEquals(first.and(second), Probability.createProbability(0.25));
    }
}