package com.bootcamp.units;

import java.util.Objects;

public class Length {

    public static final double INCH_TO_CM = 2.5;
    public static final int CM = 1;
    public static final double MM_TO_CM = 0.1;
    public static final int FEET_TO_CM = 30;
    private final double value;

    public Length(double value) {
        this.value = value;
    }

    public static Length createFeet(double value) throws InvalidLengthException {
        return create(value, FEET_TO_CM);
    }

    private static Length create(double value, double factor) throws InvalidLengthException {
        if(value < 0) {
            throw new InvalidLengthException();
        }

        return new Length(value * factor);
    }

    public static Length createInch(double value) throws InvalidLengthException {
        return create(value, INCH_TO_CM);
    }

    public static Length createCentimeter(double value) throws InvalidLengthException {
        return create(value, CM);
    }

    public static Length createMillimeter(double value) throws InvalidLengthException {
        return create(value, MM_TO_CM);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(value, length.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Length add(Length other) {
        return new Length(this.value + other.value);
    }
}
