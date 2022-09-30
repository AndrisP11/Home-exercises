package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private int sideA;
    private int sideB;

    public Triangle(int numSides, int sideA, int sideB) {
        super(numSides);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        double hipo = Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
        double area = Math.sqrt((halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - hipo)));
        return area;
    }

    @Override
    public double getPerimeter() {
        double hipo = Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
        return hipo + sideA + sideB;
    }
}
