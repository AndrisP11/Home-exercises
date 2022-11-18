package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise2 {

    public void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace(System.out);
        }

    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace(System.out);
        }
    }

    public void methodC() throws ArithmeticException {
        try {
            int res = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {
        Exercise2 test = new Exercise2();
        test.methodA();
    }
}
