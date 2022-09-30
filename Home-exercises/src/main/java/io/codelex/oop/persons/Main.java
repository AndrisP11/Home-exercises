package io.codelex.oop.persons;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, 1, 13);
        Employee employee1 = new Employee("John", "Brown", "235355", 25, "Accountant", date);
        System.out.println(employee1.getInfo());

        Customer customer1 = new Customer("Peter", "Brown", "566436", 20, "CID1234", 10);
        System.out.println(customer1.getInfo());
    }
}
