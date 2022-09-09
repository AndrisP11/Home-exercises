package io.codelex.typesandvariables.practice;

public class Casting {
    public static void main(String[] args) {
        first();
        second();
    }

    private static void first() {
        String a = "1";
        int first = Integer.parseInt(a);
        Integer b = 2;
        int second = b;
        int c = 3;
        double d = 4;
        int fourth = (int)d;
        float e = 5;
        int fifth = (int)e;
        //fixme - should be 15 :| 
        int sum = first + second + c + fourth + fifth;
        System.out.println(sum);
    }

    private static void second() {
        String a = "1";
        float first = Float.parseFloat(a);
        Integer b = 2;
        float second = b;
        int c = 3;
        float third = c;
        double d = 4.2;
        float fourth = (float)(d);
        float e = 5.3f;


        //fixme - should be 15.5 :| 
        float sum = first + second + third + fourth + e;
        System.out.println(sum);
    }
}
