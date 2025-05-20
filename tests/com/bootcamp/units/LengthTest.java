package com.bootcamp.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void inchToFeetComparison() throws InvalidLengthException {
        Length oneFeet = Length.createFeet(1);
        Length twelveInch = Length.createInch(12);

        assertEquals(oneFeet, twelveInch);
    }

    @Test
    void shouldNotCreateInstanceForInvalidValue() {
        assertThrows(InvalidLengthException.class, () -> {
            Length oneFeet = Length.createFeet(-1);
        });
    }

    @Test
    void feetToInchComparison() throws InvalidLengthException {
        Length oneFeet = Length.createFeet(2);
        Length twelveInch = Length.createInch(24);

        assertEquals(oneFeet, twelveInch);
    }

    @Test
    void inchToCentimeter() throws InvalidLengthException {
        Length twoCentimeter = Length.createCentimeter(5);
        Length twentyFourInch = Length.createInch(2);

        assertEquals(twoCentimeter, twentyFourInch);
    }

    @Test
    void centimeterToInch() throws InvalidLengthException {
        Length twoCentimeter = Length.createCentimeter(2.5);
        Length twentyFourInch = Length.createInch(1);

        assertEquals(twoCentimeter, twentyFourInch);
    }

    @Test
    void centimeterToMillimeter() throws InvalidLengthException {
        Length oneCentimeter = Length.createCentimeter(1);
        Length tenMillimeter = Length.createMillimeter(10);

        assertEquals(oneCentimeter, tenMillimeter);
    }

    @Test
    void addInches() throws InvalidLengthException {
        Length twoInches = Length.createInch(2);
        Length threeInches = Length.createInch(3);
        Length fiveInches = Length.createInch(5);

        assertEquals(twoInches.add(threeInches), fiveInches);
    }

    @Test
    void addDifferentUnits() throws InvalidLengthException {
        Length twoInches = Length.createInch(2);
        Length twoAndHalfCentimeters = Length.createCentimeter(2.5);
        Length threeInches = Length.createInch(3);

        assertEquals(twoInches.add(twoAndHalfCentimeters), threeInches);
    }
}