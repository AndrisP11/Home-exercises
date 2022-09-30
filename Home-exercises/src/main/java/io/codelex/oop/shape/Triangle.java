package io.codelex.oop.shape;

public class Triangle extends Shape {
    private int sideA;
    private int sideB;

    public Triangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        double hipo = Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
        double area = Math.sqrt((halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - hipo)));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double hipo = Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
        return hipo + sideA + sideB;
    }
}
