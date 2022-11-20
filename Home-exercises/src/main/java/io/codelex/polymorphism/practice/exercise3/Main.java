package io.codelex.polymorphism.practice.exercise3;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(9.7, "Bob", "Mason", "Proper street 12", 234563235);
        Employee employee1 = new Employee("Teacher", "Lisa", "Barkly", "Maple street 2b", 345335355);

        student1.display();
        System.out.println();
        employee1.display();
    }
}
