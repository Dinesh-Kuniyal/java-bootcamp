package com.bootcamp.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void area() {
        Rectangle rectangle = new Rectangle(2, 2);
        int area = rectangle.area();

        assertEquals(4, area);
    }
}