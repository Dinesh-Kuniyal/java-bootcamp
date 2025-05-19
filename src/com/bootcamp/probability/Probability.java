package com.bootcamp.probability;

public class Probability {

    private final int possibleOutcomes;
    private final int totalOutcomes;

    public Probability(int possibleOutcomes, int totalOutcomes) {
        this.possibleOutcomes = possibleOutcomes;
        this.totalOutcomes = totalOutcomes;
    }

    public double gettingChances() {
        return (double) possibleOutcomes / totalOutcomes;
    }

    public double notGettingChances() {
        return  (double) 1 - gettingChances();
    }
}
