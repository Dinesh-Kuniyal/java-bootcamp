package com.bootcamp.units;

public class Feet extends Unit {

    private final int value;

    public Feet(int value) {
        this.value = value;
    }

    public static Feet create(int value) throws Exception {
        if(value < 0) {
            throw new Exception("Invalid value");
        }

        return  new Feet(value);
    }

    @Override
    Inch toBase() throws Exception {
        return Inch.create(value * 12);
    }
}
