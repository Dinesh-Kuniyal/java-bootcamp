package com.bootcamp.shapes;

public class Square implements ClosedShapes {

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}
