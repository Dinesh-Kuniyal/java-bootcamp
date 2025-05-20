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

    @Test
    void inchToCentimeter() {
        Length twoCentimeter = Length.createCentimeter(5);
        Length twentyFourInch = Length.createInch(2);

        assertEquals(twoCentimeter, twentyFourInch);
    }

    @Test
    void centimeterToInch() {
        Length twoCentimeter = Length.createCentimeter(2.5);
        Length twentyFourInch = Length.createInch(1);

        assertEquals(twoCentimeter, twentyFourInch);
    }

    @Test
    void centimeterToMillimeter() {
        Length oneCentimeter = Length.createCentimeter(1);
        Length tenMillimeter = Length.createMillimeter(10);

        assertEquals(oneCentimeter, tenMillimeter);
    }
}