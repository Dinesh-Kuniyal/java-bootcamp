package com.bootcamp.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void inchToFeetComparison() {
        Length oneFeet = Length.createFeet(1);
        Length twelveInch = Length.createInch(12);

        assertEquals(oneFeet, twelveInch);
    }

    @Test
    void feetToInchComparison() {
        Length oneFeet = Length.createFeet(2);
        Length twelveInch = Length.createInch(24);

        assertEquals(oneFeet, twelveInch);
    }
}