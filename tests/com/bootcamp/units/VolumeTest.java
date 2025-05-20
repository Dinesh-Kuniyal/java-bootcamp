package com.bootcamp.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void gallonToLitre() throws Exception {
        Volume oneGallon = Volume.createGallon(1);
        Volume litres = Volume.createLitre(3.7);
        assertEquals(oneGallon, litres);
    }

    @Test
    void litreToGallon() throws Exception {
        Volume litre = Volume.createLitre(7.4);
        Volume twoGallon = Volume.createGallon(2);
        assertEquals(litre,twoGallon);
    }

    @Test
    void shouldNotCreateGallonIfGivenInvalidValue() {
        assertThrows(Exception.class, () -> {
            Volume invalidGallon = Volume.createGallon(-1);
        });
    }

    @Test
    void shouldNotCreateLitresIfGivenInvalidValue() {
        assertThrows(Exception.class, () -> {
            Volume invalidGallon = Volume.createGallon(-1);
        });
    }
}