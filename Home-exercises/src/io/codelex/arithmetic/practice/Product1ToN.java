package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        for (int i = 1; i <= 10; i++) {
            a = a * i;
        }
        System.out.println(a);
    }
}
