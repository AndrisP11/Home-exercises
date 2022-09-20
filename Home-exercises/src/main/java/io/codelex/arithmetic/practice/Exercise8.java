package io.codelex.arithmetic.practice;

public class Exercise8 {
    public static void main(String[] args) {
        pay(7.50, 35);
        pay(8.20, 47);
        pay(10.00, 73);
    }

    public static void pay(double salary, int hours) {
        if (salary <= 8.0) {
            System.out.println("Error. Hourly salary must be at least 8.00$ in hour.");
        } else if (hours > 60) {
            System.out.println("Error. Hours worked in the week, must be less than 60.");
        } else if (hours > 40) {
            double sal = (hours - 40) * salary * 1.5;
            sal = sal + (salary * 40);
            System.out.println(String.format("%.2f", sal));
        } else {
            double sal = salary * hours;
            System.out.println(sal);
        }
    }
}
