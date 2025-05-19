package com.bootcamp.probability;

import java.util.Objects;

public class Probability {
    private final double probability;

    private Probability(double probability) {
        this.probability = probability;
    }

    public Probability compliment() {
        return new Probability(1 - probability);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(probability, that.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }

    public static  Probability createProbability(double chances) throws Exception {
        if(chances > 1) {
            throw new Exception("Invalid chances");
        }

        return new Probability(chances);
    }

    public Probability and(Probability toAnd) {
        return new Probability(probability * toAnd.probability);
    }
}