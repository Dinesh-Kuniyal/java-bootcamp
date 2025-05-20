package com.bootcamp.units;

public abstract class Unit {
    abstract Inch toBase() throws Exception;

    boolean isEqual(Unit i) throws Exception {
        return i.toBase().isEqual(this.toBase());
    }
}
