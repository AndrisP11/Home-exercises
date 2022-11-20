package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {
    private double gpa;

    public Student(double gpa, String firstname, String lastname, String address, int id) {
        super(firstname, lastname, address, id);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void display() {
        System.out.println("Students gpa: " + this.gpa);
        super.display();
    }
}
