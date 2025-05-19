package com.bootcamp.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void area() {
        Square square = new Square(2);
        int area = square.area();

        assertEquals(4, area, "should able to calculate the area of square");
    }

    @Test
    void areaWithZeroSide() {
        Square square = new Square(0);
        int area = square.area();

        assertEquals(0, area, "should able to calculate the area of square with 0 side");
    }

    @Test
    void perimeter() {
        Square square = new Square(2);
        int perimeter = square.perimeter();

        assertEquals(8, perimeter, "should able to calculate the perimeter of square");
    }

    @Test
    void perimeterWithZeroSide() {
        Square square = new Square(0);
        int perimeter = square.perimeter();

        assertEquals(0, perimeter, "should able to calculate the perimeter of square with 0 side");
    }
}