package com.bootcamp.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {
    @Test
    void shouldNotCreateInvalidInchInstance() {
        assertThrows(Exception.class, () -> {
            Inch oneInch = Inch.create(-1);
        }, "should not create instance of invalid value");
    }
}