package io.codelex.oop.shape;

public class Hexagon extends Shape {

    private int sideLength;

    public Hexagon(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        double rez = ((3 * Math.sqrt(3)) / 2) * (sideLength * sideLength);
        return rez;
    }

    @Override
    public double calculatePerimeter() {
        return sideLength * 6;
    }
}
