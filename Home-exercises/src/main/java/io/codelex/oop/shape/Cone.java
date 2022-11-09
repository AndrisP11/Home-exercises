package io.codelex.oop.shape;

public class Cone extends ThreeDShape {

    private double height;
    private double radius;

    public Cone(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double rez = Math.PI * radius * (radius + Math.sqrt((height * height) + (radius * radius)));
        return rez;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateVolume() {
        double rez = Math.PI * radius * radius * (height / 3);
        return rez;
    }
}
