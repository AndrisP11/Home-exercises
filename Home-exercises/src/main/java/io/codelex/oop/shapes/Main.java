package io.codelex.oop.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 5, 7);
        System.out.println("Rectangle");
        System.out.println("Sides: " + rectangle1.getNumSides());
        System.out.println("Perimeter: " + String.format("%.2f", rectangle1.getPerimeter()));
        System.out.println("Area: " + String.format("%.2f", rectangle1.getArea()));
        System.out.println();

        Triangle triangle1 = new Triangle(3, 5, 4);
        System.out.println("Triangle");
        System.out.println("Sides: " + triangle1.getNumSides());
        System.out.println("Perimeter: " + String.format("%.2f", triangle1.getPerimeter()));
        System.out.println("Area: " + String.format("%.2f", triangle1.getArea()));

    }
}
