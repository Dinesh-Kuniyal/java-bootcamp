package com.bootcamp.units;

public class Inch extends Unit {

    private final int value;

    private Inch(int value) {
        this.value = value;
    }

    public static Inch create(int value) throws Exception {
        if(value < 0) {
            throw new Exception("Invalid value");
        }

        return  new Inch(value);
    }

    @Override
    Inch toBase() {
        return this;
    }

    @Override
    boolean isEqual(Unit i) throws Exception {
        return this.value == i.toBase().value;
    }
}
