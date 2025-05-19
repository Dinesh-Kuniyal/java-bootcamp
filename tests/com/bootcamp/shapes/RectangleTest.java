package com.bootcamp.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void area() {
        Rectangle rectangle = new Rectangle(2, 2);
        int area = rectangle.area();

        assertEquals(4, area, "should find the area of rectangle");
    }

    @Test
    void areaWithNoLength() {
        Rectangle rectangle = new Rectangle(0, 2);
        int area = rectangle.area();

        assertEquals(0, area, "should calculate the area with 0 length");
    }

    @Test
    void areaWithNoBreadth() {
        Rectangle rectangle = new Rectangle(2, 0);
        int area = rectangle.area();

        assertEquals(0, area, "should calculate the area with 0 breadth");
    }

    @Test
    void perimeter() {
        Rectangle rectangle = new Rectangle(2, 2);
        int perimeter = rectangle.perimeter();

        assertEquals(8, perimeter, "should calculate the perimeter");
    }
}