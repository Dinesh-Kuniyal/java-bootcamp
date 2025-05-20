package com.bootcamp.units;

import java.util.Objects;

public class Volume {

    private final double value;

    public Volume(double value) {
        this.value = value;
    }

    private static Volume create(double value, double factor) throws Exception {
        if(value < 0) {
            throw new Exception("Invalid value");
        }

        return new Volume(value * factor);
    }

    public static Volume createLitre(double value) throws Exception {
        return create(value, 1);
    }

    public static Volume createGallon(double value) throws Exception {
        return create(value, 3.7);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(value, volume.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
