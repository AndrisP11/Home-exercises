package io.codelex.oop.shape;

public class Qube extends ThreeDShape {
    double side;

    public Qube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 12 * side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }
}
