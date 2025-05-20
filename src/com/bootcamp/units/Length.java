package com.bootcamp.units;

import java.util.Objects;

public class Length {

    private final double value;

    public Length(double value) {
        this.value = value;
    }

    public static Length createFeet(double value) throws InvalidLengthException {
        return create(value, 30);
    }

    private static Length create(double value, double factor) throws InvalidLengthException {
        if(value < 0) {
            throw new InvalidLengthException();
        }

        return new Length(value * factor);
    }

    public static Length createInch(double value) throws InvalidLengthException {
        return create(value, 2.5);
    }

    public static Length createCentimeter(double value) throws InvalidLengthException {
        return create(value, 1);
    }

    public static Length createMillimeter(double value) throws InvalidLengthException {
        return create(value, 0.1);
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
