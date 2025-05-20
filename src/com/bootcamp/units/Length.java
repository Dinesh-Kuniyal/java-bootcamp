package com.bootcamp.units;

import java.util.Objects;

public class Length {

    private final double value;

    public Length(double value) {
        this.value = value;
    }

    public static Length createFeet(double value) {
        return create(value, 30);
    }

    private static Length create(double value, double factor) {
        return new Length(value * factor);
    }

    public static Length createInch(double value) {
        return create(value, 2.5);
    }

    public static Length createCentimeter(double value) {
        return create(value, 1);
    }

    public static Length createMillimeter(double value) {
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
}
