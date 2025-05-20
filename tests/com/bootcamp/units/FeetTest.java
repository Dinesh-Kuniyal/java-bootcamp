package com.bootcamp.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {
    @Test
    void shouldNotCreateInstanceOfInvalidValue() {
        assertThrows(Exception.class, () -> {
            Feet oneFeet = Feet.create(-9);
        }, "should not create instance of feet if given invalid value");
    }

    @Test
    void compareWithInches() throws Exception {
        Feet oneFeet = Feet.create(1);
        Inch twelveInch = Inch.create(12);

        assertTrue(oneFeet.isEqual(twelveInch));
    }
}