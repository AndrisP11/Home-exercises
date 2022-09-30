package io.codelex.oop.shape;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5, 7);
        System.out.println("Rectangle");
        System.out.println("Perimeter: " + String.format("%.2f", rectangle1.calculatePerimeter()));
        System.out.println("Area: " + String.format("%.2f", rectangle1.calculateArea()));
        System.out.println();

        Triangle triangle1 = new Triangle(6, 7);
        System.out.println("Triangle");
        System.out.println("Perimeter: " + String.format("%.2f", triangle1.calculatePerimeter()));
        System.out.println("Area: " + String.format("%.2f", triangle1.calculateArea()));
        System.out.println();

        Hexagon hexagon1 = new Hexagon(4);
        System.out.println("Hexagon");
        System.out.println("Perimeter: " + String.format("%.2f", hexagon1.calculatePerimeter()));
        System.out.println("Area: " + String.format("%.2f", hexagon1.calculateArea()));
        System.out.println();

        Cone cone1 = new Cone(7, 3);
        System.out.println("Cone");
        System.out.println("Perimeter: " + String.format("%.2f", cone1.calculatePerimeter()));
        System.out.println("Area: " + String.format("%.2f", cone1.calculateArea()));
        System.out.println("Volume: " + String.format("%.2f", cone1.calculateVolume()));
        System.out.println();

        Qube qube1 = new Qube(7);
        System.out.println("Cube");
        System.out.println("Perimeter: " + String.format("%.2f", qube1.calculatePerimeter()));
        System.out.println("Area: " + String.format("%.2f", qube1.calculateArea()));
        System.out.println("Volume: " + String.format("%.2f", qube1.calculateVolume()));

    }
}
